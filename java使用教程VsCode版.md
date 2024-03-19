# vs code 上手java

完全新的没有java环境的电脑和vscode中：

### 了解vscode中的java启动教程

- 打开文件夹

- 创建java程序

- 然后自动跳出java扩展包

- 安装包以及其他扩展（跳出的那个包里面自带的）

>  界面：

![image-20240318170633612](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318170633612.png)

【这个图片提供了有关开始Java开发的指导，包括安装Java开发工具包（JDK）的步骤】

1. 需要至少安装一个Java运行时环境来准备你的开发环境。
2. 你可以通过点击“安装JDK”按钮来安装JDK。
3. 还提供了如何验证JDK安装成功的步骤：创建一个新的终端（命令提示符或终端窗口）并运行命令`java -version`。这将显示已安装的Java版本，以此来验证安装是否成功。

- 点击install JDK

  > ![image-20240318170749639](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318170749639.png)
  >
  > 安装新的JDK（Java Development Kit）的界面；
  >
  > 提供了不同版本的JDK供选择，包括：
  >
  > - Adoptium的Temurin 8 (LTS)
  > - Adoptium的Temurin 11 (LTS)
  > - Adoptium的Temurin 17 (LTS)
  > - Adoptium的Temurin 21 (LTS)
  >
  > “Adoptium的Temurin”是JDK的一个版本，由Eclipse Foundation提供
  >
  > Adoptium是一个开放源代码项目，之前被称为AdoptOpenJDK。它的目标是提供高质量的Java环境和二进制文件，包括Java开发工具包（JDK）和Java运行时环境（JRE）。Adoptium项目由Eclipse Foundation管理，致力于确保Java生态系统的持续健康和发展；Temurin是Adoptium项目提供的JDK的名称；Temurin旨在提供完全开源、高性能、可靠的JDK版本，供开发者和组织使用
  >
  > 
  >
  > 其中带有“LTS”的表示它们是“长期支持”版本
  >
  >  
  >
  > JVM中的HotSpot是Java虚拟机（JVM）的一种实现，由Oracle公司和其前身Sun Microsystems公司开发。它被称为“HotSpot”是因为它能够“热点检测” —— 即能够识别Java程序中被频繁执行的代码部分（热点代码），并将这些代码优化编译成本地代码以提高性能。这种技术可以显著提高Java应用程序的运行速度。
  >
  >  
  >
  > 

- 版本选择：我是一个初学者，仅仅是想要学习java的面向对象的原理和一些基本的东西，比如网络，数据库，GUI，类，application开发等等而已

  作为一个刚开始学习Java的初学者，我建议你选择一个稳定的长期支持（LTS）版本，比如Temurin 11或Temurin 17。

  ###### 如果你的电脑配置比较新，操作系统更新，我建议选择**==Temurin 17==**。它将为你提供最新的特性和改进，同时保持稳定性。如果你对将来的变化持保守态度，或者你使用的是较旧的操作系统，**Temurin 11**可能是一个更好的选择，因为它依然提供现代特性，但在市场上已经稳定运行了更长时间。

- 注意安装好了jvm之后就要重启vscode才行

- `Launch, debug and test`表示可以使用`ctrl_shift_d`来启动运行和调试java代码

- 扩展插件的安装：

  >  **Ctrl + Shift + X** 快捷启动
  >
  > ![image-20240318172635790](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318172635790.png)
  >
  > ![image-20240318172910496](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318172910496.png)
  >
  > ![image-20240318172920537](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318172920537.png)
  >
  > ![image-20240318172902012](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318172902012.png)
  >
  > ![image-20240318172928043](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318172928043.png)
  >
  >  
  >
  > 1. **Frameworks**:
  >    - **Spring Boot Extension Pack**: 如果你打算使用Spring Boot进行快速、简洁的Web开发，这个扩展包很有用。
  >    - **Extension Pack for MicroProfile**: 如果你对开发基于MicroProfile的微服务应用感兴趣，可以考虑这个扩展。
  >    - **Quarkus**: 如果你有兴趣探索Quarkus框架以实现超快速的云原生应用，这个扩展值得考虑。
  > 2. **Application Servers**:
  >    - **Community Server Connectors**: 如果你需要连接和部署到不同的服务器或容器，这个扩展可能有用。
  > 3. **Keymaps**:
  >    - **Eclipse Keymap**: 如果你以前使用Eclipse并习惯于它的快捷键，这个扩展可以帮助你在VS Code中使用相同的快捷键。
  >    - **IntelliJ IDEA Keybindings**: 类似地，如果你来自IntelliJ IDEA的背景，这个扩展可以让你在VS Code中使用熟悉的快捷键。
  >
  > **应该安装哪些？**
  >
  > - 如果你是Java初学者，我建议你现在专注于“Basics”部分的扩展，它们为Java开发提供了必要的基础。
  > - 如果你对Web开发感兴趣，可以考虑安装“Spring Boot Extension Pack”。
  > - 如果你暂时不打算使用特定的Java框架、服务器或特定IDE的快捷键绑定，你可以跳过这些扩展，直到你需要它们的时候再安装。
  >
  > 

- 使用vscode中关于java的教程：

  > `Explore more Java resources`
  >
  > Open` HelpCenter`提示：使用键盘快捷方式（`Shift+F1`)

- java程序编写界面的展示：

  1. **hello.java**：这表示你的Java项目中包含一个名为“hello”的Java文件。这个文件是你编写和编辑Java代码的地方。
  2. **JRE System Library [JavaSE-17]**：这表示你的项目正在使用Java 17版本的Java运行环境（JRE）。JRE包含了运行Java应用程序所需的库和其他资源。这使得你的Java程序能够在JRE提供的运行时环境中执行。
  3. **Referenced Libraries**：这里会显示你的项目引用的外部库。如果你的项目依赖于第三方库或框架，它们会在这个部分列出。这有助于管理和访问项目所需的所有依赖项。

  "JAVA PROJECTS"类别夹的存在使得组织和管理Java项目更加方便，尤其是当你在一个工作空间中处理多个项目时。它为你提供了一个清晰的视图，展示了项目结构、使用的JRE版本和所有参考的库。

![image-20240318173950251](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318173950251.png)









### 在vscode中一些要注意的点：

-  java文件名称要和class的名称一致；

- 黄色表示warning

- java的类名一般是大写的开头——否则警报

- 是否要创建java包：

  如果你的Java文件只有一个，并且你觉得为它创建一个完整的包结构（如`com.example`）感觉多余，那么你可以选择不使用包声明。在Java中，如果一个类不属于任何包，那么它属于默认包。这通常在小型项目或学习示例中见到。

- 使用`System.out`可能会导致警报的出现：

  ![image-20240318180413998](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318180413998.png)

  在你提供的截图中，`System.out.println`语句上的黄色警报是由SonarLint生成的。SonarLint是一个用于IDE的代码质量检查工具，它可以帮助识别代码中的潜在问题，比如bug、漏洞或代码风格的问题。

  根据截图，警报代码是 `java:S106`，这通常与标准输出和错误流的使用相关。具体来说，SonarLint通常会标记直接使用`System.out`或`System.err`进行打印的实践，因为在生产级别的应用程序中，直接使用这些方法进行日志记录或输出通常不是最佳实践。而是建议使用日志框架或更结构化的日志处理方法。

  `System.out.println` 在教学或小型、个人项目中是常见且方便的，但在大型或生产环境的应用程序中，使用日志框架（如Log4j、SLF4J等）可以提供更灵活的日志管理能力，例如日志级别控制、日志文件记录等，这有助于更好地监控和诊断应用程序的状态。

- 



![Uploaded image](https://files.oaiusercontent.com/file-xGi7oq3gM7DsnBoZvp9H0ZW8?se=2024-03-18T10%3A21%3A30Z&sp=r&sv=2021-08-06&sr=b&rscc=max-age%3D299%2C%20immutable&rscd=attachment%3B%20filename%3Dimage.png&sig=Y5IY81GzQiRq%2BKSbD1qA/DcnSjXYiYmHrIwZ6QXge6Y%3D)

### package功能的演示

目录结构应该像这样：

```css
src/
├── animals/
│   └── Dog.java
└── people/
    ├── Person.java
    └── Veterinarian.java
```

现在，我们来定义这些类：

**Dog.java:**

```java
package animals;

public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says: Bark!");
    }
}
```

**Person.java:**

```java
package people;

public class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }
}
```

**Veterinarian.java:**

```java
package people;
import animals.Dog;

public class Veterinarian {
    public String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public void checkDog(Dog dog) {
        System.out.println("Veterinarian " + name + " is checking " + dog.name);
        dog.bark();
    }
}
```



> package people;这里代表什么意思？

`package people;` 这行代码位于Java文件的顶部，它声明了该文件中定义的类属于名为 `people` 的包。

值得注意的是：一个Java文件中的所有类都属于该文件顶部声明的包。确实，你不能在同一个Java文件中为不同的类声明不同的包

值得注意的是：package只能写java文件所在的文件夹的名字

![image-20240318175531173](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318175531173.png)







### 如何启动这么多的package构成的程序：

程序要有Main程序才可以：

`public static void main(String[] args)` 是 Java 程序的入口点。当你运行一个 Java 程序时，JVM（Java虚拟机）会寻找这个特定的方法来启动程序。这个方法必须是公开的（`public`），静态的（`static`），没有返回值（`void`），并且名为 `main`。此外，它必须接受一个字符串数组作为参数（即 `String[] args`）。

![Uploaded image](https://files.oaiusercontent.com/file-xGi7oq3gM7DsnBoZvp9H0ZW8?se=2024-03-18T10%3A21%3A30Z&sp=r&sv=2021-08-06&sr=b&rscc=max-age%3D299%2C%20immutable&rscd=attachment%3B%20filename%3Dimage.png&sig=Y5IY81GzQiRq%2BKSbD1qA/DcnSjXYiYmHrIwZ6QXge6Y%3D)

但是注意：

在“整个java程序”中的某一个程序那里点击运行，就可以发现这个运行效果和运行Main的效果是一样的

![Uploaded image](https://files.oaiusercontent.com/file-xGi7oq3gM7DsnBoZvp9H0ZW8?se=2024-03-18T10%3A21%3A30Z&sp=r&sv=2021-08-06&sr=b&rscc=max-age%3D299%2C immutable&rscd=attachment%3B filename%3Dimage.png&sig=Y5IY81GzQiRq%2BKSbD1qA/DcnSjXYiYmHrIwZ6QXge6Y%3D)

因为vscode会自动地识别项目中地java程序，找到带有Main函数的代码去执行；如果有多个带有Main类的java代码，比如这里的Elur.java和Main.java

![image-20240318182129319](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318182129319.png)



<img src="https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318182141966.png" alt="image-20240318182141966" style="zoom:67%;" />



<img src="https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318182154962.png" alt="image-20240318182154962" style="zoom: 67%;" />



那么会自动地执行最近聚焦的含Main类的java代码









# Vscode其他：

### 如何禁用vscode扩展：

在Visual Studio Code中取消或禁用SonarLint扩展的步骤如下：

1. 在VS Code中，转到侧边栏的扩展视图。你可以通过点击左侧边栏的方块图标或通过按下`Ctrl+Shift+X`来访问它。
2. 在扩展搜索栏中，输入“SonarLint”以找到已安装的SonarLint扩展。
3. 在搜索结果中找到SonarLint扩展，然后点击它。
4. 你将看到一个描述SonarLint扩展的页面。在这个页面上，应该有几个选项按钮，如“Disable”（禁用）和“Uninstall”（卸载）。
   - 如果你想暂时禁用SonarLint，点击“Disable”按钮。VS Code可能会提示你重启编辑器以应用更改。
   - 如果你想完全删除SonarLint，点击“Uninstall”按钮。同样，重启编辑器以确保完全移除。

重启VS Code后，SonarLint扩展将不再激活，VS Code将只使用其内置的语法检查器。









### 如何在Vscode中使用git来管理代码：

#### github创建仓库和github的推荐过程

vscode中内置git功能：所以我们先在github上创建一个仓库：

创建好后看到的是：

![image-20240318183613596](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318183613596.png)

【这张截图显示的是GitHub为新创建的仓库提供的快速设置指南。这里的内容提供了几种不同的方法来开始使用你的新GitHub仓库：】

1. **Quick setup**: 如果你已经熟悉这样的操作，GitHub提供了仓库的 URL，你可以用它来设置你的本地仓库的远程链接。你可以选择使用 HTTPS 或 SSH 方式来克隆仓库。

2. **创建新仓库指南**:

   - 这部分提供了一系列命令来初始化一个新的本地Git仓库，添加一个`README.md`文件（这是一个通常用于描述项目的文档），进行首次提交，并将它推送到GitHub上。

   - 命令如下：

     ```
     bashCopy codeecho "# java_learning_programs" >> README.md
     git init
     git add README.md
     git commit -m "first commit"
     git branch -M main
     git remote add origin https://github.com/lijiandao/java_learning_programs.git
     git push -u origin main
     ```

   - 这些命令逐步创建了一个新的Git仓库，添加了你的第一个文件（`README.md`），并将其推送到了你的GitHub仓库。

3. **推送现有仓库指南**: ==（我们的方法）==

   - 如果你已经有一个本地仓库，并想要将它推送到GitHub上，这里提供了一组命令来添加远程仓库的链接，并将你的更改推送上去。

   - 命令如下：

     ```
     git remote add origin https://github.com/lijiandao/java_learning_programs.git
     git branch -M main
     git push -u origin main
     ```







#### 我们的具体做法：

win路径：`N:\java_learning_programs\how_run_so_much_packages`

linux路径：`/n/java_learning_programs/how_run_so_much_packages`

0.修改git-bash的文件路径

```
25131@三岁就很皮 MINGW64 ~
$ cd /n/java_learning_programs/how_run_so_much_packages
```



**1.创建本地仓库**

```bash
25131@三岁就很皮 MINGW64 /n/java_learning_programs/how_run_so_much_packages
$ git init
Initialized empty Git repository in N:/java_learning_programs/how_run_so_much_packages/.git/
```





**2.将文件添加到git仓库，被本地的git仓库知道并管理**

```bash
git add .
```



**3.在提交更改之前需要设置git的作者身份信息：**

```
git config --global user.email "you@example.com"
git config --global user.name "Your Name"

```

如果你只想在当前仓库设置用户名和邮箱地址，而不是全局（对所有仓库生效），你可以移除 `--global` 标志，只在当前仓库中运行：

```
git config user.email "you@example.com"
git config user.name "Your Name"

```

> 配置这些信息的目的：

在提交之后，你的用户名和邮箱会记录在提交信息中。





**4.提交更改：**

```bash
git commit -m "Initial commit"
```

> add 和 commit 的区别是？

`git add .`在 Git 中，当你创建一个新文件时，它不会自动被纳入版本控制；需要手动将对应的文件添加到本地git仓库中被git追踪代码变化

 `git commit -m "message"` 是用来实际提交这些更改到仓库的历史记录中，并附上一条解释更改的消息。

作为单独的一条记录；





**5.将本地的git仓库和github对应的repo构建关联，这样下次需要被push的时候就可以知道要push到哪里**

```bash
git remote add javabank https://github.com/lijiandao/java_learning_programs.git
```

确保替换 `https://github.com/your_username/your_repository.git` 为你的 GitHub 仓库 URL。



> `git remote add origin https://github.com/your_username/your_repository.git` 这条命令用于将本地的 Git 仓库与远程的 GitHub 仓库关联起来。解释如下：
>
> - `git remote add` 是 Git 命令，用于添加一个新的远程仓库链接。
> - `origin` 是远程仓库的默认简称（别名），在未来的操作中可以使用这个名字代替完整的仓库链接。
> - `https://github.com/your_username/your_repository.git` 是远程仓库的 URL，其中 `your_username` 应替换为你的 GitHub 用户名，`your_repository` 应替换为你的 GitHub 仓库名。





**6.提交到github仓库中：**

> `git commit` 是提交到本地仓库。如果要提交到 GitHub 上，需要使用 `git push` 命令将本地的更改推送到远程仓库。

```
git push -u javabank main
```

> 这里的-u 代表 --set-upstream 
>
> javabank代表前面设置的 `git remote add javabank https://github.com/lijiandao/java_learning_programs.git` 中设置的远程仓库的别名；因为git管理的本地commit提交记录版本可能不一定总是提交到一个远程仓库中，这需要我们去记忆；
>
> 这里的main代表着：git认为你要上传本地的一个叫做main的分支；



> 实际上这句代码有问题：因为git本地的默认分支是master 但是github上的仓库的默认分支是main 这是因为历史的原因github认为master有奴隶主的含义，所以改成了main
>
> 正确是：

```bash
git push -u javabank master:main
```

但是如果是：

```bash
git push -u javabank master
```

则会将本地的master分支上传到github仓库上；



### 其他的git的功能：



### 如何删除当前目录下的git仓库配置文件：

```bash
rm -rf .git
```





> 如何理解合并



当你执行一个合并命令（如 `git merge some-branch`），Git 会查看当前分支和指定的分支（`some-branch`），尝试将它们的更改合并到一起。这包括所有从两个分支的共同祖先以来的更改。





### 如果“远程分支 `main` 比你的本地分支 `master`要新，该怎么办

首先，使用以下命令将远程的更改拉取并合并到你的本地分支：

```bash
git pull javabank main



"""
25131@三岁就很皮 MINGW64 /n/java_learning_programs (master)
$ git pull javabank main
From https://github.com/lijiandao/java_learning_programs
 * branch            main       -> FETCH_HEAD
fatal: refusing to merge unrelated histories
"""

"""
出现“fatal: refusing to merge unrelated histories”这个错误，是因为 Git 认为你的本地分支和远程分支没有共同的历史。这通常发生在两个完全独立的仓库或分支之间尝试进行合并时。从 Git 2.9.0 版本开始，默认不允许合并没有共同祖先的分支，以避免意外合并可能导致的问题。

为了解决这个问题，你可以在拉取命令中添加 --allow-unrelated-histories 选项，以允许合并两个没有共同历史的分支。
"""

```

这将会从远程的 `main` 分支拉取最新的更改并尝试与你的本地 `master` 分支合并。如果出现冲突，你需要手动解决它们，并完成合并。



允许合并无关的历史：

```bash
git pull javabank main --allow-unrelated-histories
# 如果github仓库里面的文件结构和本地不一致：
# 将会直接增加github中的文件到当前cd的目录
```



重新推送：

```bash
git push javabank HEAD:main

# 在 Git 中，HEAD 是一个引用，用于指向当前分支的最新提交。
```

注意：每次的push都是增量更新；如果没有新的更改或提交，在你执行 `git push` 时，Git 会提示说什么都没有更新。这就是为什么 Git 是一个有效的版本控制系统 —— 它只上传需要上传的更改，减少了不必要的数据传输。



如果远程仓库有多个分支，比如 `branch1`, `branch2`, `branch3`，并且你想要将本地的 `branch4` 推送到远程仓库，并在远程创建同名的新分支 `branch4`，你可以使用以下命令：

```
git push -u javabank branch4
# 一个分支名称，那么代表本地的那个和远程的那个是一样的分支名称
# 表示把当前的git所在的目录提交到远程的github仓库中 如果远程没有branch4则创建一个
```



### 如何强制git将当前的push进行覆盖更新？

使用`--force`进行强制的覆盖更新

```bash
git push --force javabank branch-name
```



# 类和对象











# 异常处理

### 第一部分：异常处理概述

#### 异常的种类

- 检查型异常（Checked Exceptions）：
  - 必须在编码时处理（try...catch）或声明（throws）的异常。
  - 异常通常是外部错误和可恢复的情况，比如文件未找到、网络问题等。它们不是由程序内部逻辑错误引起的。
  - Java采取了“强制错误处理”的策略，确保这些潜在问题不被忽视。
- 非检查型异常（Unchecked Exceptions）:
  - 在编译时不需要处理或声明的异常。
  - 通常是程序逻辑错误，如数组越界或空指针异常。
  - Java则提供了更多的灵活性，不强制要求捕获或声明这些异常，因为它们通常指程序内部的错误，应该通过更好的编程习惯来避免
- 错误（Errors）:
  - 代表系统级别的问题，如虚拟机错误、内存溢出。
  - 通常不应由程序员处理。

#### 异常的层次结构

- Throwable 类：
  - 是所有错误和异常的超类。
  - 有两个主要子类：Error 和 Exception。
- Exception 类：
  - 所有检查型异常和非检查型异常的父类。
  - 常见子类包括 IOException、SQLException。
- Error 类：
  - 由Java虚拟机产生和定义。
  - 包括 OutOfMemoryError、StackOverflowError 等。
- Exception 和 Error 的区别：
  - Exception 主要由程序控制和处理。
  - Error 通常反映更严重的问题，不应该被程序控制和处理。

___



### 第二部分：异常处理机制



#### 异常的自动检测和错误处理：

——可以理解为程序员去使用别人生产的类的时候，的给类报警设置的监听器





>  **try -catch-finally  的使用**
>
> 模板——单个异常
>
> ```java
> try {
>     // 尝试执行的代码
> } catch (ExceptionType name) {
> 
>     // 处理异常的代码
> }
> ```
>
>  注释：ExceptionType常见的java中的有：
>
> ###### 检查型异常（Checked Exceptions）：
>
> 这些异常必须在编写代码时显式地进行处理（通过`try-catch`或者通过在方法签名中使用`throws`关键字）。
>
> 1. **IOException**：用于处理与输入输出操作相关的失败，如文件读写错误。
> 2. **SQLException**：用于处理与数据库访问相关的错误。
> 3. **ClassNotFoundException**：在尝试加载类时，如果找不到对应的类，就会抛出这个异常。
> 4. **InterruptedException**：当一个线程正在等待、睡眠或以其他方式被占用，而线程被中断时抛出。
>
> ###### 非检查型异常（Unchecked Exceptions）：
>
> 这些异常在编码时不需要显式捕获，它们主要是由程序错误引起的。
>
> 1. **NullPointerException**：当尝试使用`null`对象或调用其方法时抛出。
> 2. **ArrayIndexOutOfBoundsException**：访问数组时使用了非法索引（例如，使用负数或超出数组大小的索引）时抛出。
> 3. **ArithmeticException**：发生异常的算术条件时抛出，例如除以零。
> 4. **IllegalArgumentException**：向方法传递非法或不适当的参数时抛出。
> 5. **IllegalStateException**：在非法或不适当的时间调用方法时抛出。
>
> 
>
> 实际：单个异常：
>
>  ```java
>   try {
>             // 尝试执行的代码
>             int result = divideNumbers(10, 0); // 故意传递一个不合法的参数
>             System.out.println("结果是：" + result);
>         } catch (IllegalArgumentException e) {
>             // 处理异常的代码
>             System.out.println("发生错误：" + e.getMessage());
>             // 在实际应用中，这里可能会有更复杂的错误处理逻辑
>         }
>  ```
>
> 
>
>  
>
> 模板：多个异常
>
> ```java
> # 多个异常的捕获
> catch (IOException | SQLException ex) {
>     // 处理多种类型的异常
> }
> ```
>
>  
>
> catch 中的一旦接收到的异常类符合catch中的ExceptionType 就会将这个Exception引用传递给name
>
> 
>
> 当 `try` 代码块中发生异常时，Java运行时系统会检查这个异常是否与 `catch` 代码块中指定的异常类型匹配（或者是它的子类）。如果匹配，那么异常对象会被传递给 `catch` 代码块中定义的变量（在你的示例中是 `name`）。然后，`catch` 代码块的代码会被执行来处理异常。如果 `try` 块中发生的异常类型与 `catch` 块中指定的 `ExceptionType` 不匹配，那么该 `catch` 块将被跳过，继续查找匹配的 `catch` 块（如果有的话）。







>  **finally 块的使用**
>
> - `finally` 块总是在 `try-catch` 结构后执行，无论是否捕获或处理异常。
> - 常用于关闭资源，如文件或网络连接。
>
> - 如果 `try` 或 `catch` 块有 `return` 语句，`finally` 块仍然会执行。
> - `finally` 块完成后，方法才会返回。







> **catch命令是如何实现捕捉的：**
>
> 当程序执行到 `try` 代码块中的代码时，如果发生了异常（例如访问数组的一个不存在的索引），Java 虚拟机（JVM）会创建一个异常对象，这个对象包含了异常发生时的信息，包括异常类型、方法调用栈等。然后，JVM 会查找最近的包含相应 `catch` 块的代码：如果找到了一个匹配的 `catch` 语句，那么程序的控制权就会转移到那个 `catch` 语句；如果没有找到，异常就会被传递出当前方法，继续向上抛给调用者。













#### 异常的手动抛出：

——可以理解为生产类的开发者为了检测使用我开发的类的时候的错误检测，将错误定义成名称返回给 消费者程序员调用者





> 为什么要手动抛出异常？

总之：在自定义类中，要检测类外部的调用和命令的**合法性**，如果**不合法**，要将错误信息返回给调用类的代码，进而被外部检测处理：





> 如何手动抛出异常？
>
> throw 和 throws 关键字





下面是**三种典型例子**：

1. **参数验证**：当一个方法接收到无效参数时，可以抛出一个 `IllegalArgumentException` 来指示调用者问题所在。例如，如果一个方法期望一个非负数作为参数，但接收到一个负数，它可以抛出这个异常。

   ```java
   public void setAge(int age) {
       if (age < 0) {
           throw new IllegalArgumentException("年龄不能为负数");
       }
       // 正常处理
   }
   
   ```

   

2. **状态验证**：如果对象的状态不允许执行某个操作，可以抛出一个 `IllegalStateException`。例如，尝试从一个空栈中弹出元素。

   ```java
   public int pop() {
       if (size == 0) {
           throw new IllegalStateException("栈为空");
       }
       // 正常处理
   }
   
   ```





3. **失败的后置条件**：如果方法的操作无法满足其保证的后置条件，也可以抛出异常。例如，在处理文件时，如果无法关闭文件，可以抛出一个异常。

   ```java
   public void closeFile() {
       if (!file.close()) {
           throw new IOException("无法关闭文件");
       }
   }
   
   ```

   



> throw和throws的区别





**throw**：

```java
public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            // 使用throw关键字抛出一个具体的异常实例
            throw new IllegalArgumentException("年龄不足18岁");
        } else {
            System.out.println("年龄验证通过");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); // 尝试传递一个不符合条件的年龄
        } catch (IllegalArgumentException e) {
            System.out.println("捕获的异常: " + e.getMessage());
        }
    }
}

```





**throws：**

```java
import java.io.*;

public class ThrowsExample {
    // 使用throws关键字声明该方法可能会抛出IOException异常
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println(br.readLine());
        br.close(); // 关闭文件
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt"); // 尝试打开并读取一个文件
        } catch (IOException e) {
            System.out.println("捕获的异常: " + e.getMessage());
        }
    }
}

```











> 尤其注意throws的用法：

`throws` 是在**方法签名中声明该方法**==可能会==抛出的一种或多种异常类型。

throws可以声明非检查型异常，也可以声明检查型异常：

正常的没有throws的：

```java
public static void readFile(String fileName) {
    File file = new File(fileName);
    BufferedReader br = new BufferedReader(new FileReader(file));
    System.out.println(br.readLine());
    br.close(); // 关闭文件
}
```

使用了throws的：

```java
public static void readFile(String fileName) throws IOException {
    File file = new File(fileName);
    BufferedReader br = new BufferedReader(new FileReader(file));
    System.out.println(br.readLine());
    br.close(); // 关闭文件
}
```

对于调用者调用这类方法：如果没有采用try-catch，就不予编译：强制要求进行异常捕捉；













> throws遇到抛出错误：catch到了错误的输出演示：
>
> 这里面还演示了自定义异常类：`d`和标准的异常类——`Exception`来实现的throw异常

**自定义的异常类：**

```java
package round;


public class Round_ex_custom {
    private double radius;
    public class NegativeRadiusException extends Exception{
        public NegativeRadiusException(String message) {
            super(message);
        }
    }
    public double caculateArea(double Radius) throws NegativeRadiusException {  //这里就是可能抛出的异常的对象
        if(Radius<0)
        {
            NegativeRadiusException e = new NegativeRadiusException("来自于自定义错误类的报错：error! radius must be positive");
            // 这里创建了一个通常的使用的通用异常类，然后抛出了这个异常，这个异常将会被打印出来，以方便定位异常地点；
            throw e;
        }
        return Math.PI * Radius * Radius;
    }

    public Round_ex_custom(double Radius) {
        radius=Radius;
    }

    public double getArea() {
        try {
            return caculateArea(radius);
        } catch (NegativeRadiusException e) {
            e.printStackTrace();
            //  那么它会执行 e.printStackTrace(); 打印异常堆栈，
        }
        //catch仅仅是一个异常处理，如果出现异常就会继续执行catch以及之后的代码部分，不会停止程序运行
        return 0; // Add a default return value in case of exception
    }
}

```







**标准异常类：**

```java
package round;

public class Round {
    private double radius;
    public double caculateArea(double radius) throws Exception {  //这里就是可能抛出的异常的对象
        if(radius<0)
        {
            Exception e = new Exception("来源于通用异常类的报错:error! radius must be positive");
            // 这里创建了一个通常的使用的通用异常类，然后抛出了这个异常，这个异常将会被打印出来，以方便定位异常地点；
            throw e;
        }
        return Math.PI * radius * radius;
    }
    public Round(double Radius) {
        radius=Radius;
    }

    public double getArea() {
        try {
            return caculateArea(radius);
        } catch (Exception e) {
            e.printStackTrace();
            //  那么它会执行 e.printStackTrace(); 打印异常堆栈，
        }
    //catch仅仅是一个异常处理，如果出现异常就会继续执行catch以及之后的代码部分，不会停止程序运行
        return 0; 
    }
}

```



当给如radius=-1的时候的输出：

![image-20240318233958646](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318233958646.png)















# VsCode中的问题：

### 解决 VSCode Ctrl Shift P 快捷键不可用

问题：快捷键被占用：

>  搜索快捷键注册情况：



下载搜索软件:

https://github.com/BlackINT3/OpenArk/releases/tag/v1.3.4

点击：![image-20240318232837032](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318232837032.png)

下载连接 https://github.com/BlackINT3/OpenArk/releases/download/v1.3.4/OpenArk64.exe

使用教程：https://blog.csdn.net/jpch89/article/details/109381076

使用步骤：

![image-20240318232759280](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318232759280.png)









### VSCode 出现Build failed, do you want to continue?



![image-20240318233310590](https://cdn.jsdelivr.net/gh/lijiandao/picgohub@main/image-20240318233310590.png)
