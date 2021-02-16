# Hacktzi Blog

This is a Hacktzi Blog android app. The main purpose of this application is provide to the hacktzi community an easy way for sharing notes, documents, projects or any others useful resources.

## Features
 This project has features which support our main goal which is sharing content, these are:

- Login
- Home
- News
- Project
- Post
- Activity

## Architecture

[Android Architecture](images/hacktzi-android-architecture.png)

## Contribution
Feel free to contribute either by requesting or developing new features

- [Clone the repo](https://github.com/HackTzi/app-blog-hacktzi-kotlin)
- Create a branch off of development and give it a meaningful name (e.g. feature/login-ui, feature/login-data , etc )
- Open a pull request on GitHub and describe the feature, fix or post.

### GIT Commit Conventions
We are going to use [udacity guideline](http://udacity.github.io/android-nanodegree-guidelines/git.html.)

The main reason is that it provides a really good way to keep track of what each commit is actually trying to achieve. Also, try to commit every piece of code that you consider is important change.

The following structure will be used for every commit:

<code>
type: subject body (optional just in case a really deep explanation is needed)
</code>

The Type can be any of the following values:

| Type | Purpose |
|--|--|
| feature | A new feature |
| fix | A bug fix |
| docs | Changes to documentation |
| style | Formatting, missing semi colons, etc; no code change |
| refactor | Refactoring code |
| test | Adding tests, refactoring test; no production code change |
| config | Updating build tasks, package manager configs, etc; no production code change |

Here is an example of what a commit would looks like:


    feature: Add user and password inputs in login screen
    
    More detailed explanatory text, if necessary. Explain the problem that this commit is solving. Focus on why you are making this change as opposed to how (the code explains that). Are there side effects or other unintuitive consequenses of this change? Here's the place to explain them.



## Coding Style

The main programming language that this project will use is Kotlin. For coding style purposes, we are going to respect this guide: https://developer.android.com/kotlin/style-guide

**Naming Convention**

In order to make the code look consistent cross modules, we have decided to come up with naming conventions.

| Item | Naming Convention | Example |
|--|--|--|
| Modules | **hacktzi-`<name>`** | **hacktzi-login** |
| Packages | **`<main_package>`.`<name>`** | **com.hacktzi.blog.login** |
| Android/Architecture Components | **`<name><component>`** | **LoginViewModel** |
| Arguments | **ARG_`<name>`** | **ARG_EMAIL = "email"** |
| Preferences | **KEY_`<name>`** | **KEY_EMAIL = "com.hacktzi.blog.email"** |
| XML Files | **`<what>_<description>`** |<li>**activity**_login.xml</li><li>**fragment**_login.xml</li><li>**dialog**_change_password.xml (layouts for any kind of dialog)</li><li>**conten**t_login_header.xml (specific layouts to be used within other layouts)</li><li>**menu**_login.xml</li><li>**view**_login.xml (custom views XML base specification)</li><li>**item**_login.xml (items for lists)</li>|
| Resource Strings | **`<what>_<description>`** | <li>**text**_username (Messages, warnings, descriptions)</li><li>**text_hint**_username (Default description that appears within any kind of input)</li><li>**text_title**_login (For titles/subtitles and any kind of header text)</li> |
| Resource Drawables | **`<what>_<description>`** | <li>**ic**_user_profile_photo.xml (Images/Icons)</li><li>**bg**_rounded_blue.xml (Backgrounds / Selectors)</li><li>**color**_button_blue (Colors under color directory)</li><li>**view**_circle_loading.xml (Custom drawable views)</li> |
| Resource Dimensions | **`{where}_<what>_{description}`** | <li>**size_small**</li><li>**button_width_large**</li><li>**toolbar_height**</li><li>**notification_header_padding_top** (Works for padding & margins)</li><li>**text_size_small**</li> |
| Resource Colors | **`<name>_<value>`** | blue_light |
| Resource View IDs | **`<prefix> + <description>`** | <li>**ly** + Login (Any kind of layouts such as Constraints/AppBar/Linear and so on)</li><li>**btn** + Login (Any kind of button, such as Button, ImageButton, RadioButton, ToggleButton and so on)</li><li>**tv** + Username (All sort of non-editable labels such as TextViews)</li><li>**et** + Username (All sort of editable text inputs such as EditTexts)</li><li>**chk** + Policy (All views that require a check/uncheck interaction such as CheckBoxes)</li><li>**img** + Photo (All views that are used to show images such as ImageViews)</li>

## Discusions
Refer to the issues section: [https://github.com/HackTzi/app-blog-hacktzi-kotlin/issues]
