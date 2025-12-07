# Freedium Android - Paywall For Medium

[![GitHub stars](https://img.shields.io/github/stars/subhamsinhadev/Freedium-Android.svg?style=social)](https://github.com/subhamsinhadev/Freedium-Android/stargazers)
[![Made with Android](https://img.shields.io/badge/Made%20with-Android-green?logo=android)](#)


> Freedium is a sleek Android application developed using Java and Material Design 3 (MD3). It allows users to seamlessly bypass Medium’s paywall and read articles without any restrictions.



---
“Read Member only – with Freedium Android.”

## 📱 Features
Key Features:

Clipboard Auto-detect Upcomin
Share Article From Medium Using Share Option-Share Via Link --> Click on Freedium Boom Opened without copy pasting

Bypass Paywall – Access Medium articles without login or paywall interruptions

Modern UI – Smooth, responsive interface following Material You (MD3) design principles

Dynamic Theming – Light and Dark mode support based on system settings

Optimized Performance – Fast, clean reading experience with minimal distractions

Share with Ease – Share article links directly from the app with a single tap


---

## 📸 Screenshots

<p align="center">
  <img src="https://github.com/subhamsinhadev/Freedium-Android/blob/main/screenshots/home.png" alt="Home Screen" width="30%" style="margin-right:10px;"/>
    <img src="https://github.com/subhamsinhadev/Freedium-Android/blob/main/screenshots/about.png" alt="Reading Screen" width="30%" style="margin-right:10px;"/>
      </p>

---

---
# Application Flowcharts

Freedium Android follows a structured and efficient internal workflow designed to securely handle Medium article URLs and provide a clean, paywall-free reading experience.  
The following diagrams illustrate the app’s core architecture and URL processing pipeline.

---

## 1. Freedium App Architecture

This flowchart represents the internal structure of the Freedium Android application. It shows how the app listens for Medium article links, processes them, and renders the final article view.

### Architecture Diagram  
![Freedium App Architecture Flowchart](https://github.com/subhamsinhadev/Freedium-Android/blob/main/screenshots/Arch.png)

### Description  
- The Freedium App acts as the central controller.  
- Incoming data is captured through:  
  - Clipboard Listener  
  - Share Intent Receiver  
- All received text is forwarded to the URL Parser, which uses regular expressions to extract Medium links.  
- The sanitized URL is then loaded through the WebView Loader.  
- The final content is displayed as a clean, paywall-free article.  
- The application interface uses Material Design 3 with support for dynamic themes.

---

## 2. URL Handling and User Flow

This flowchart outlines the complete flow from app launch to article rendering. It illustrates how the app decides the input method, processes the URL, and loads the final content.

### URL Handling Flow Diagram  
![URL Handling Flowchart](https://github.com/subhamsinhadev/Freedium-Android/blob/main/screenshots/urlhandle.png)

### Description  
- When the application is opened, it checks how the Medium URL is being provided:  
  - Automatic clipboard detection  
  - Share Intent (Share → Freedium)  
  - Manual URL entry  
- All inputs are routed to the URL extraction stage, where a Medium link is identified using regular expressions.  
- The extracted URL is loaded directly into a secure WebView.  
- The WebView renders an unrestricted, paywall-free version of the Medium article.

---

## Purpose of These Flowcharts

These diagrams provide a clear understanding of how Freedium Android operates internally.  
They serve as technical documentation to help contributors, reviewers, and recruiters quickly understand the data flow, architecture, and design decisions behind the application.

---

## 🛠️ Tech Stack:
💻 Java (Native Android)

🎨 Material Design 3 (Material Components)

## 📦 Releases

Grab the latest release of **Freedium** and enjoy unrestricted reading!

👉 **[Download APK](https://github.com/subhamsinhadev/Freedium-Android/releases/latest)**  
📄 **[View All Releases](https://github.com/subhamsinhadev/Freedium-Android/releases)**  
🆕 **Latest Version:** `v1.2.0`  
🗓️ **Released on:** July 29, 2025

---
## 🚀 Getting Started

1. **Clone the repository:**
```bash
git clone https://github.com/subhamsinhadev/Freedium-Android.git
```

2. **Open in Android Studio**

3. **Build and Run** on Emulator or Physical Device

4. **Paste any Medium article URL** and start reading!

✅ Enjoy unrestricted access to Medium articles  
❤️ Show Some Love

---

## 🧠 Learning Goals (for Developers)

📌 Integrate WebView securely in Android  
📌 Apply Material 3 design with dynamic themes  
📌 Implement modern UI/UX using native Java  
📌 Add share functionality and handle URLs effectively
📌 Add intent to receivie data from other app
📌 Using Regex to extract url from medium data (Parsing It To WebView)

---

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**!

1. **Fork the Project**
2. **Create your Feature Branch**
```bash
git checkout -b feature/AmazingFeature
```
3. **Commit your Changes**
```bash
git commit -m "Add some AmazingFeature"
```
4. **Push to the Branch**
```bash
git push origin feature/AmazingFeature
```
5. **Open a Pull Request**

---

## 🌟 Show your Support

If you like the project, consider leaving a ⭐️ to help others discover it!

1. ⭐ Star this repository
2. 🔁 Share it with your friends
3. 🛠️ Fork and contribute to enhance it further!

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

**Built with ❤️ by Subham Kumar Sinha**
📧 [LinkedIn](https://www.linkedin.com/in/subhamsinhadev)



