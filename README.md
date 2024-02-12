<h1 align="center">MagicTabLayout</h1><br/>
<p align="center"> 
An efficient TabLayout library implemented in Jetpack Compose 🚀
</p>
<br/>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
  <img alt="repo size" src="https://img.shields.io/github/repo-size/iamageo/MagicTabLayout"/>
  <br/>
    <img alt="forks" src="https://img.shields.io/github/forks/iamageo/MagicTabLayout?style=social"/>
    <img alt="stars" src="https://img.shields.io/github/stars/iamageo/MagicTabLayout?style=social"/>


</p>

## Anatomy
![banner_magic_tab_layout](https://user-images.githubusercontent.com/26925002/186786657-432fe672-0eb8-4502-af00-e0f2b6dd81eb.png)
1. MagicTabLayout
2. tabIndicatorColor (Optional, default value: blue)
3. MagicTabItem
4. MagicTabItem title

## Including in your project
[![](https://jitpack.io/v/iamageo/MagicTabLayout.svg)](https://jitpack.io/#iamageo/MagicTabLayout)

### Gradle
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
    implementation 'com.github.iamageo:MagicTabLayout:1.0.3'     
}
```

## Basic Usage
Add in you Activity file.

```kotlin
/* specify your tabs */
val tabs = listOf(
    MagicTabItem(title = "Home") { TabItemTest(item = "tab1") },
    MagicTabItem(title = "Favorites") { TabItemTest(item = "tab2") },
    MagicTabItem(title = "Settings") { TabItemTest(item = "tab3") },
)

Column() {
    MagicTabLayout(
        tabIndicatorColor = Color.Blue,
        tabColor = Color.White,
        tabList = tabs,
    )
}

/* in this case TabItemTest contains bellow composable function, but you can pass your functions */
@Composable
fun TabItemTest(item: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = item,
            color = Color.Black,
        )
    }
}
```

## License
```
    Copyright 2022 Geovani Amaral

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

```
