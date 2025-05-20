History Flashcard Quiz
Developer: Iyad Hassim
Student Number: ST10474150
Group: 3
Course: IIE Higher Certificate in Mobile Application and Web Development
Subject: Introduction to Mobile Application Development 
Links
GitHub Repository: https://github.com/ST10474150/FlashcardGame.git
YouTube Video: 


Project Overview
The History Flashcard Quiz is a mobile application developed as part of an assignment in Mobile Application Development. This application was created using Kotlin and Android Studio. The app’s primary purpose is to help users test and improve their knowledge of history using an interactive true/false flashcard system.
The app was developed to meet the assignment requirements, which include creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.

Purpose:
The main goal of this app is to provide a fun and educational quiz experience to help users review historical facts and test their knowledge.

Key Features:
True/False Flashcard Quiz: Users are presented with five history-related questions and can answer using “True” or “False”.

Score and Feedback System: The app gives immediate feedback after each answer and shows the final score with personalized feedback.
Review Screen: Users can review all flashcards with correct answers after completing the quiz.
Exit Option: Users can exit the app cleanly from the final screen.


These features aim to provide an engaging and educational platform for students and anyone interested in brushing up on historical facts.



The design of the History Flashcard Quiz was based on the following key considerations:
User Experience (UX): Designed with clear, readable text and large buttons for easy interaction, especially on mobile devices.
Responsiveness: Layouts were built using ConstraintLayout to ensure compatibility across various screen sizes.
Simplicity: The interface avoids clutter and focuses on one function at a time, keeping the user journey simple and smooth.
Performance: Lightweight design and efficient code ensure quick transitions and low memory usage.


Video Demo:


A video showcasing the app’s functionality can be viewed here: 
Challenges and Learnings


Challenge 1: Managing state across activities
Solution: I used Intent extras to pass data (like score and question index) between activities. This ensured correct score tracking.
Challenge 2: UI updates after button clicks
Solution: I implemented feedback messages with delays using Kotlin logic and ensured the “Next” button only appears after answering.



These experiences taught me how to handle user input, navigate between screens, and manage apps effectively.


Future Enhancements
While the current version meets the assignment criteria, I would like to expand the app:
Add More Questions: Include more than five flashcards and randomly shuffle them for variety.
Users Progress Tracking: Store user scores locally to show progression over time.
Dark Mode: Add a theme toggle for better usability in low-light environments.
Different topics eg. physics or biology, allowing for more vairiety.

References:
Google.“Android Developers.” Android Developers, 2018, developer.android.com/.

The IIE. 2014.Introduction to programming logic module manual 
2025. https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7B44999D8E-32B6-4613-B393-F77FCC911175%7D&file=IPRG5111MM.docx&action=default&mobileredirect=true

The IIE. 2014.Introduction to mobile application development module manual 
2025. https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true
