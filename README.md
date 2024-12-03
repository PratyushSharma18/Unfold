# Unfold
![u](https://github.com/user-attachments/assets/5cc0e1cc-18fd-491d-bcd7-b7d192a93b5e)


## It is an user-friendly Android application developed in Kotlin language which is designed to keep you updated with the latest news from around the world. Leveraging modern Android development practices and powerful libraries it delivers a seamless and efficient news-reading experience.

### Here are the following Usages/Implementations by which this application is built: 
#### API Integration:
- The API fetches latest news data from external sources every time a user uses the application as it would refresh on its own and update the latest news articles on the main news headlines fragment.

#### Retrofit Instance:
- A Retrofit instance is essential in integrating a News API into your Android application, providing a streamlined and efficient way to handle network requests and parse JSON responses.
- This instance is configured with the base URL of the API, a converter factory (typically for JSON), and possibly an HTTP client for additional configurations like logging or timeouts.
- Retrofit takes care of converting the raw JSON response into Kotlin data classes (e.g., NewsResponse). This is facilitated by the GsonConverterFactory, which automatically parses JSON into your predefined data structures.
- Retrofit also provides mechanisms for error handling and logging. You can check if the response was successful using response.isSuccessful, and if not, handle errors accordingly. Additionally, you can add interceptors to log requests and responses, which is invaluable for debugging.
- It provides a clean and efficient way to interact with APIs, handles the details of network communication, and maps JSON responses to Kotlin objects.


#### Search & Save functionality:
- A user can save any news article by clicking on the favourite button and the selected articles will show in the favourites fragment.
- One can also delete the saved article and undo the same within the specific time.
- One can also search the news by typing the desired topic or keyword in the search bar in search fragment and can get the news related to that topic.

#### Recyclerview & Webview:
- All the fetched news articles would be shown in the recyclerview in a list view format within the fragments.
- Webview enables the fuctionality to view the complete article within the application fragment without going to the browser.

#### Room Database(Entity, Database Access Object and Database):
- Entity: It defines the data structure entity for a fetched news article.
- DAO: Provides method for data process
- Database: It acts as a database holder and serves as a main access point.
- All the saved news articles would be stored in the room databsse so that the person could the access the saved articles even in the offline mode.

#### Navigation framework:
- Nav graph determines the navigation between the fragments within the application.
- It instantiates the directional flow of activity/fragment from one to another.
