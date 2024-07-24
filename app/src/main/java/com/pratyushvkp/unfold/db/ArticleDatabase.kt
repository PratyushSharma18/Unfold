package com.pratyushvkp.unfold.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.pratyushvkp.unfold.models.Article


@Database(
    entities = [Article::class],
    version = 1
)

@TypeConverters(Converters::class)
abstract class ArticleDatabase: RoomDatabase() {
    abstract fun getArticleDao(): ArticleDAO

    companion object{
        @Volatile //This annotation ensures that changes made by one thread immediately visible to another thread
        private var instance: ArticleDatabase? = null
        private val LOCK =  Any() //This lock object ensures that only one thread executes inside a block at a time

        //invoke operator is used for simplicity when creating an instance and double tick locking pattern is implemented to ensure threat safety during database creation process
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"
            ).build()


    }
}