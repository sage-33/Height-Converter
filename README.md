# Height Converter Project

## Part One: Install Eclipse, Set up Commit Template, and Import Project

### Install Eclipse

Go to https://www.eclipse.org/ and click the orange Download button. It will take you to another page where you will click the Download button again. This will take you to a third page where you will again click the Download button.

Open up the Eclipse Installer and Click `Eclipse IDE for Java Developers`

Click the Install button.

While it's installing follow the next steps.

### Clone Project and Set up Commit Template

Begin by cloning the provided project and importing it into your workspace.

`git clone <url for github repository>`

After cloning this repository you want to run these commands

`git checkout -b development`

This will create a branch named development and switch you to it. The development branch is where you will make all your commits.

```
cp git-commit-template.txt ~/.git-commit-template.txt
git config --global commit.template ~/.git-commit-template.txt
```

This will set up your commit template to automatically bring up the file to remind you of the format you want.

### Import into Eclipse

You should then go to Eclipse, which hopefully has finished installing.

In the top toolbar, click File --> Import. Double-click on General and then Existing Projects into Workspace. Click Browse next to Project Root Directory and find your folder and click Open. The project should pop up in the text box Projects. Click finish and you should be good to go!

## Part Two: Complete HeightConverter Assignment
For this assignment, write a complete program that prints your name, age, your height in inches, and - using the fact that there are 2.54 centimeters in an inch - your height in centimeters.
The objectives of this assignment are to:

- Be able to write a Java class definition with a main method.
- Be able to declare and initialize variables of type int, double, and String.
- Be able to use a mathematical operator to calculate a value and assign it to a variable.
- Be able to use the concatenation operator to combine Strings with variables in statements that print to the console.
  A sample solution output is given below:

```
Pat Wilson
age: 22
height: 67 inches
height: 170.18 cm
```

Project Requirements:

- Your class must be named HeightConverter.
- Your solution must be a complete class, enclosing a main method.
- You must declare a double variable named conversionFactor that is initialized to 2.54.
- You must declare a String variable named myName that is initialized to your name, i.e. "Pat Wilson".
- You must declare an int variable named myAge that is initialized to your age in years.
- You must declare an int variable named myHeightInches that is initialized to your height in inches.
- You must declare a double variable named myHeightCM that is initialized to the product of the variables myHeightInches and conversionFactor. You must use the appropriate variables from the list above in the calculation. You will not receive credit for "hard-coded" values in your calculation, as in this example: myHeightCM = 67\*2.54 or myHeightCM = 170.18; (where you did the calculation on a calculator).
- You must write a series of print statements that produce the specified output to the console. Your print statements must use the concatenation operator to combine literal Strings, such as "age: " with the appropriate variables mentioned above. You will not receive credit for "hard-coded" values in your print statements, as in these examples, where the age value of 22 is hard-coded:
  `System.out.println("age: "+22);`
  or
  `System.out.println("age: 22");`
- Your output must match the format shown above exactly- of course the numeric values will differ, but you must follow the format shown. That means you must print the units after the values.
- Your code should be simple: no objects created, just use assignment and print statements in the main method.

## Part Three: Commit Project and Submit Pull Request
When you have finished your solution and are ready to submit, make a commit and push eveything up to Github.

Submit a pull request to the main repository so that I know your code is ready to be reviewed.
