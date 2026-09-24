# 📱 Adaptive ListView and ImageView - Android

An Android application demonstrating an **adaptive user interface using ListView and ImageView**. The application displays a scrollable list of items, where each item contains an image and text.

---

## 🎯 Aim

To create an adaptive Android user interface using **ListView and ImageView** for displaying a list of items with images and text.

---

## ✨ Features

- 📋 Displays items using ListView
- 🖼️ Displays images using ImageView
- 📝 Displays item names using TextView
- 🔧 Uses a Custom Adapter
- 📱 Adaptive and responsive user interface
- ↕️ Supports vertical scrolling
- 📐 Uses `dp` and `sp` for dimensions and text
- 🔄 Uses `match_parent`, `wrap_content`, and `layout_weight`
- 🎨 Simple and user-friendly interface

---

## 🛠️ Technologies Used

- **Android Studio**
- **Java**
- **XML**
- **Android SDK**

---

## 📚 Android Components Used

### 1. ListView

ListView is used to display multiple items in a vertically scrollable list.

### 2. ImageView

ImageView is used to display images for each item in the ListView.

### 3. TextView

TextView is used to display the name or description of each item.

### 4. Custom Adapter

CustomAdapter connects the data with the ListView and creates a customized layout for each list item.

### 5. LinearLayout

LinearLayout is used to arrange the ImageView and TextView horizontally.

---

## 📱 Application Description

The application contains a main screen with the title **"My Gallery"**.

The ListView displays four items:

1. Android Mobile App
2. Java Programming
3. Python Programming
4. Database Management

Each item contains:

- An image
- Item name
- A responsive layout

---

## 🖥️ Application Layout

```text
┌─────────────────────────────┐
│                             │
│         My Gallery          │
│                             │
├─────────────────────────────┤
│                             │
│  [ IMAGE ]  Android Mobile  │
│             App             │
│                             │
├─────────────────────────────┤
│                             │
│  [ IMAGE ]  Java Programming │
│                             │
├─────────────────────────────┤
│                             │
│  [ IMAGE ]  Python           │
│             Programming      │
│                             │
├─────────────────────────────┤
│                             │
│  [ IMAGE ]  Database         │
│             Management       │
│                             │
└─────────────────────────────┘
                Start Application
                       │
                       ▼
                ┌─────────────┐
                │ MainActivity│
                └──────┬──────┘
                       │
                       ▼
                  ┌─────────┐
                  │ ListView│
                  └────┬────┘
                       │
                       ▼
                ┌─────────────┐
                │CustomAdapter│
                └──────┬──────┘
                       │
              ┌────────┴────────┐
              ▼                 ▼
         ┌──────────┐      ┌──────────┐
         │ ImageView│      │ TextView │
         └──────────┘      └──────────┘
              │                 │
              └────────┬────────┘
                       ▼
                  List Item

AdaptiveListView/
│
├── app/
│   │
│   └── src/
│       │
│       └── main/
│           │
│           ├── java/
│           │   │
│           │   └── com.example.adaptivelistview/
│           │       │
│           │       ├── MainActivity.java
│           │       └── CustomAdapter.java
│           │
│           ├── res/
│           │   │
│           │   ├── drawable/
│           │   │   ├── android.png
│           │   │   ├── java.png
│           │   │   ├── python.png
│           │   │   └── database.png
│           │   │
│           │   └── layout/
│           │       ├── activity_main.xml
│           │       └── list_item.xml
│           │
│           └── AndroidManifest.xml
│
└── README.md
