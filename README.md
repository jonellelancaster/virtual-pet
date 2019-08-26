#Virtual Baby Project

create a VirtualPet class.
create a VirtualPetApp class with a main method.
Stretch goal create a VirtualPetTest class to build out unit tests on the behaviors placed in VirtualPet
You should house your project in a properly named package…something other than the default package
#Details
Create a virtual pet application. This is your version of a Tamagotchi or DigiPet! This might seem like a daunting task, but we can break it down.

Think of which instance variables and methods you will need. We give suggestions below. Remember that instance variables represent the state of your pet. Methods represent the behavior of your pet, which would include its responses to you feeding or playing with it.

Most games include what is called a game loop, a loop which updates everything in the game, representing the passage of time. We exit this loop when something happens that should cause the game to end. Include a tick() method (think clocks, not parasites) in your VirtualPet class representing the passage of a unit of time. This should do things like update instance variables of VirtualPet that are time dependent, such as hunger or thirst. You should call the tick() to represent the passage of time after each interaction with the user.

There is always some confusion with this tick() method. It has some flexibility, what you are doing is changing the properties of your Virtual Pet at some rate in this method…every time this method is called, those properties specified in this method would update.


#Required Tasks
VirtualPet class
Create a tick() method that represents the passage of time.
Create at least three instance variables (aka attributes aka properties aka fields).
Create at least three methods (messages you send to your pet).
VirtualPetApp class
Create a main method that…
implements a game loop.
asks for user input.
writes output to the console.
Grading
Here is the rubric.

#Stretch Tasks
Give the pet the ability to take care of some of its own needs.

Pets are not robots - they usually have some sort of self-determination! When tick() is called, you might want to have your pet take a look at its needs and address one, prioritizing whichever need is highest. You could also make your pet uncooperative - when the user tries to feed the pet, for example, you might make the pet refuse to eat if it is bored. Remember how we created an instance of the Random class to create a random number generator? You might want to incorporate that.

Create a visual representation of your pet.

Rather than using numbers to convey your pet’s status, you could have some sort of visual representation of the pet. I.e., instead of printing hunger: 50, you could use smileys or ASCII art to show hunger when hunger >= 50.

     >=<        
,.--'  ''-.
(  )  ',_.'
Xx'xX      

Horace looks like this: :0

1. Feed Horace
2. Water Horace
3. Play with Horace
4. Put Horace to sleep
5. Do nothing
Assign favorite foods to your pet, and add a parameter specifying the type of food to the method you use to feed your pet. Your pet should react accordingly. You could also decide which foods it does not like.

Create Unit Tests!

Hints
Don’t try to tackle everything at once! Break this project up into smaller chunks, and you will find that they are all manageable. (Getting comfortable testing as you go will make this project more manageable!!)