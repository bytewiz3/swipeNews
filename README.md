# SwipeNews Android Application <br> (Google Component Architectural MVVM Pattern)

A Tinder style Android application that allows users to browse news and swipe to save.<br>
<br>
News Source: https://newsapi.org/
<br>
<br>

## JetPack Navigation Component
* Utilized Android Material library to create a bottom navigation view with home, search and save buttons.
* Created three navigation fragments (home, search and save), and a navigation graph.

## Network with Retrofit
* Added three model classes (Source, Article and NewsResponse).
* Created NewsApi with retrofit (OkHttp, Gson) to get news responses.

## Gander (Network Logging Tool)
* Added this network debugging tool as a Retrofit interceptor.

## Model-View-ViewModel (MVVM) and Repository
* Created a Repository as an intermediate container for providing data.
* Hided network requests behind the Repository.
* Built ViewModel classes and used LiveData to provide updates for the future UI views.

![MVVMandRepository](MVVMandRepository.png)

## Stetho (Debugging Tool)
* Utilized Stetho to view network requests and local database content.

