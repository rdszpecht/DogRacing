# Dog racing:

### Introduction
This repository has the purpose of practicing Refactoring, for a better understanding you should check the commit history.

So initially, the first commit is a copy from a beginner object-oriented programming student's project, with the only exception of me creating a package named "dogRacing", which is a dog racing application.

The second commit, as an exception to the rule, is going to be me refactoring the code just for a translation from spanish to english language. Also refactoring System.out and Scanner for a developed Console class usage for testing purposes.

After that, I am going to add some tests with JUnit and Mockito, and ever since then I am going to try to detect known smell codes and refactor the project without changing its behaviour.

### About functionality
The application will ask the user for a name and a breed for two dogs. Each dog will have his speed calculated based on the race and some random factor. Then they will run a race. The winner, will be able to choose a special price.


### Example run

    Welcome to the first Dog Race
    Input a name for your pet: Yoggi
    Input the breed of your dog: Labrador
    Input a name for your pet: Crazy
    Input the breed of your dog: Doberman
    Yoggi has a speed of: 9.960763602944661
    Crazy has a speed of: 9.649230536674887
    Yoggi is the fastest dog
    As a recognition for Yoggi, winner of the race, he can chose a special price
    1. Pack of ropes to pull
    2. Dog bed
    3. Pack of balls
    4. Dog bottle of water
    Yoggi has obtained Pack of balls as a reward for him winning, also a special signature bowl!
    Crazy also wins a special signature bowl for his great performance!
    Thanks for participating!!

    Process finished with exit code 0
`

