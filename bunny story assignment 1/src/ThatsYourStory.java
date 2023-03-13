import java.awt.Font;

//The class, which is needed to host the main method below, has been named 'ThatsYourStory' over other alternatives 
// (like the name of the story) to align with the specifications provided.

public class ThatsYourStory {

	// The identifier name 'main' has been chosen over another name to declare the
	// below method
	// because this is the method/special code block that contains all of the code
	// for the create-your-own-adventure program for this assessment.

	// The code has been sequenced in such a way that a cohesive story is printed
	// out to the user, and can be interacted with dynamically by inputting values
	// that affect the story through the use of if statements.
	

	// The general justification for the use of String types is as follows:

	//	The String class was chosen to store user inputs that contain a sequence of characters as it is not whole or decimal numbers (like float or ints) 
	// or true/false statements (like booleans), that is best covered by other primitive data types. 

	// This justification applies for the following String variables: bunnyMain, bunnyFriend, choiceLocation, choiceFirstPath, choiceSecondPath, choiceThirdPath
	
	
	// The general justification for the use of the int data type is as follows:

	// The int data type was chosen to store user inputs that contain whole numbers because other primitive data types best cover different values 
	// that aren't whole numbers (for example, the float data type is better for storing decimal numbers).

	// The int data type was also chosen over String type, a non-primitive data type, because Strings are best suited for a sequence of characters and not numbers.

	// This justification applies for the following int variables: carrotInventory, minCarrot, maxCarrot, minAccessoryChoice, maxAccessoryChoice, carrotEat
	
	
	// The general justification for the use of the int data type for variables that DO NOT fit with the above justification, as they assign numbers 
	// to inputs that would otherwise be String values, is as follows:

	// The int data type, in relation to choices were the user selects an option from a list, was chosen over String, a non-primitive data type, 
	// because assigning an option that would otherwise be an input that's not just a simple word like "left" or "right" 
	// (like "white flower accessory", "See the vine and jump over it") to a number that the user can easily type in 
	// feels more user friendly and less susceptible to repeated incorrect user inputs.

	// This justification applies for the following int variables: accessoryFriend, accessoryMain, scareChoice, vineChoice, choicePerseverence
	
	
	// The general justification for the inclusion of if statements is as follows:

	// If statements were included to satisfy the requirement of having a branching story affected by a user's input, as a choice in the story 
	// can be assigned to a condition to be met in an if statement, allowing for different code blocks to be played (and a different part of the story to be read) 
	// depending on the condition that is satisfied.

	// This justification applies for the following values used in if statements throughout the story: choiceLocation, carrotInventory, accessoryFriend, accessoryMain, 
	// choicePath, scareChoice, vineChoice, carrotEat, choiceSecondPath, choiceThirdPath, choicePerseverence

	
	// The general justification for the inclusion of while statements, as well as the sequencing of code blocks that include a while statement 
	// which is then proceeded by if statements is as follows:

	// These series of conditional statements are sequenced such that the check to see whether the input is valid is placed first (using a while statement) 
	// before moving onto the rest of the if statements that reflect changes in the story depending on the user's input.

	// This justification applies for the code blocks concerning the following values: carrotInventory, accessoryFriend, accessoryMain, 
	// scareChoice, vineChoice, carrotEat, choicePerseverence


	// The general justification for the exclusion of temp strings is as follows: 

	// Temp strings like the below example were excluded:

	// String tempAmount = gt.getInputString("How many?”);
	// tempInventory = Integer.parseInt(tempAmount);
 	// gt.println("" + tempInventory);

	// Instead, the input received from the user was parsed directly and consequently stored as an int value.

	// This justification applies for the following int variables: carrotInventory, accessoryFriend, accessoryMain, scareChoice, vineChoice, carrotEat, choicePerseverence

	
	// The general justification for the exclusion of dedicated max/min int values for choice pools with only two numerical options 
	// (i.e. 1 - choice one, 2 - choice 2) is as follows:

	// int values dedicated to defining the minimum and maximum amount of choices like "ChoiceMin/ChoiceMax" was excluded as there are only two possible values 
	// (1 or 2), nor are these values referred to outside of the code blocks in which the choice is to be made. 
	// It would thus be more efficient to do greater than/less than if statements (choice > 2, choice < 1) to act as constraints on user inputs.

	//	This justification applies for the following int variables: scareChoice, vineChoice, choicePerseverence

	public static void main(String[] args) {

		// The identifier name 'gt' has been chosen over another identifier because it can be easily associated with the class, GTerm, which it is declaring.

		// The term 'new' is included besides GTerm because 'GTerm' was not created by Java, and thus needs to be repeated when a new GTerm is created, 
		// unlike the String class or a class type/wrapper associated with primitive data types.

		GTerm gt = new GTerm(1000, 1000);
		gt.setBackgroundColor(31, 31, 31);

		gt.setXY(725, 40);

		// M.Y. Dungca, "Title Bunny", unpublished, August 2020.

		gt.addImageIcon("TitleBunny.png");
		gt.setFontStyle(Font.BOLD);
		gt.setFontColor(255, 255, 255);
		gt.setFontSize(55);
		gt.setXY(20, 40);
		gt.println("the tangled woodlands.");
		gt.setFontSize(25);
		gt.println("by Ma Ysabel Dungca (Belle)");

		// M.Y. Dungca, "The Tangled Woodlands," unpublished, July 2020.

		gt.println("");
		gt.setFontSize(15);
		gt.setFontStyle(Font.PLAIN);
		gt.println("Near a small village filled with bunnies, there is a dark forest.");
		gt.println("It’s as if no sunlight could reach inside, and shadows obscure the way forward.");
		gt.println("The bunnies, who are afraid of the dark, avoid going into the forest,");
		gt.println("and nobody has ever seen what’s on the other side.");
		gt.println("");
		gt.println("One bunny, however, wants to go on an adventure, and decides that seeing what’s beyond ");
		gt.println("the dark woods is the perfect thing to do.");
		gt.println("");
		gt.setFontStyle(Font.BOLD);
		gt.println("What is the bunny's name?");
		gt.setFontStyle(Font.PLAIN);
		gt.println("");
		
		// The identifier name 'bunnyMain' has been chosen over another name because it best declares that the input to be stored 
		// is the name of the main bunny of the story, and can be differentiated from the name of the second bunny, which is also inputted by the user.

		String bunnyMain = gt.getInputString("Enter the bunny's name.");
		gt.println(bunnyMain + " lives just at the edge of the forest. As the bunny goes about their day to day life,");
		gt.println("watering their plants, going to the market, cooking good food and playing their instruments,");
		gt.println("they see glimpses into the forest. " + bunnyMain + " sees weird, but interesting shapes, ");
		gt.println("silhouettes of something that the bunny could not describe.");
		gt.println("");
		gt.println("Today, however, the forest came to visit them.");
		gt.println("");
		gt.println("As " + bunnyMain + " hops to the garden to tend to their flowers, ");
		gt.println("they see dark vines near their flowerbeds.");
		gt.println("The bunny, who was already very curious about the forest, sees this as a sign.");
		gt.println("");
		gt.println(bunnyMain + " puts their watering can down and thinks about what to do.");
		gt.println("Before they could even decide, " + bunnyMain + " hears a knock at their door.");
		gt.println("They hop to their door to answer it, and sees that their friend has come to visit them!");
		gt.println("");
		gt.showMessageDialog("Press OK to proceed with the story!");
		gt.clear();
		gt.setFontStyle(Font.BOLD);
		gt.println("What is the name of " + bunnyMain + "'s friend?");
		
		// The identifier name 'bunnyFriend' has been chosen over another name because it best declares that the variable is storing 
		// the name of the main bunny’s friend, not the name of the main bunny. 

		String bunnyFriend = gt.getInputString("Enter the second bunny's name.");
		gt.println("");
		gt.setFontStyle(Font.PLAIN);
		gt.println("Both bunnies greet each other hello, and " + bunnyFriend + " asks " + bunnyMain
				+ " what they are doing today.");
		gt.println(bunnyMain + " says that they want to go on an adventure.");
		gt.println(bunnyFriend + " jumps around in excitement, and asks " + bunnyMain + " if they could come.");
		gt.println(bunnyMain + " calms " + bunnyFriend + " down so both bunnies could prepare for their adventure.");
		gt.println("Both bunnies hop into " + bunnyMain + "'s house.");
		gt.println("They decide that they should bring food with them and get dressed in nicer clothing.");
		gt.showMessageDialog("Press OK to proceed with the story!");
		gt.setFontStyle(Font.BOLD);
		gt.println("");
		gt.println("Where should the bunnies go first?");
		gt.setFontStyle(Font.PLAIN);
		
		// The identifier 'choiceLocation' has been chosen over another identifier because it best declares that the variable contains 
		// the choice the user made as to which location to visit first.

		String choiceLocation = gt.getInputString("Should they go to the kitchen or bedroom first?");
		gt.println("");
		
		// These int variables were placed in the main code block rather than in subsequent code blocks created by conditionals for the following reasons:
		
		// - carrotAmount is referred to outside of the code blocks in which the input from the player is received. 
		// To ensure that the variable can be called back on in the main method, as well as the code blocks which the input is gathered from, 
		// it has been placed in the main method.

		// - The numerical thresholds set by minCarrot/maxCarrot are referred to in multiple instances throughout the story as a check on the user’s input. 
		// To make the code neater, instead of having to define these thresholds in each instance ( i.e. carrotAmount > 3) or (carrotAmount < 1), 
		// they have been placed in the main method as their own int variables. 

		// - The same rationale above applies for minAccessoryChoice/maxAccessoryChoice.
		

		// The name for each variable can be justified as follows:

		// - carrotInventory is a clear, concise way of defining the quantity of carrots in the bunnies’ possession 
		// (over alternatives like carrotAmount or carrotTotal)

		// - minCarrot/maxCarrot is a clear, concise way of showing the maximum and minimum amount of carrots a user can take with them, 
		// over other names like carrotQtyMax or carrotMinimum

		// - minAccessoryChoice/maxAccessoryChoice is a clear way of constraining the range of accessory choices that you can choose from, 
		// without the confusion that may arise from shortening a word (i.e. maxAccChoice/minAccChoice)

		int carrotInventory = (0);
		int minCarrot = (1);
		int maxCarrot = (3);
		int minAccessoryChoice = (1);
		int maxAccessoryChoice = (4);
		
		// This is one of the branches for the choice the user makes between visiting the kitchen or the bedroom first, 
		// where the user chooses to visit the kitchen first.

		// This code block is sequenced such that the user plays through the code related to the kitchen before moving onto the bedroom 
		//should they choose to visit the kitchen first. As someone cannot be in two places once, the user makes a choice to visit one 
		// before going to the other, and the story adjusts accordingly.

		// The following justification is applicable for both branches (where the user visits the “kitchen” or the “bedroom” first) of this first choice: 

		// The branches for visiting the kitchen first and visiting the bedroom first include substantially similar content 
		// as they comprise of a ‘kitchen’ section and a ‘bedroom’ section. The main difference between the branches is the sequence in 
		// which these sections appear in. 

		// There could be a way to formulate this choice such that it simply chooses one code block to play before the other rather depending on 
		// what is inputted by the user rather than having two if statements with relatively small differences, 
		// but given that the use of if statements are specified over other statements, this is the simplest way to fulfill this requirement.

		// int values that define the maximum and minimum amount of carrots the bunnies can bring or the range of accessory choices 
		// the bunnies can choose from have been excluded from this code block for the reasons specified prior.

		if (choiceLocation.compareToIgnoreCase("kitchen") == 0) {
			gt.println("Both bunnies decide to go to the kitchen first.");
			gt.println("With a bag in one of their paws, " + bunnyMain + " hops to their fridge and opens it.");
			gt.println(
					"They look at what they have available, and they see a pile of carrots that they freshly picked ");
			gt.println(
					"yesterday. " + bunnyMain + " looks down at their bag, and sees that they can only fit between ");
			gt.println("1 to 3 carrots before the bag becomes too full and too heavy.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("How many carrots should " + bunnyMain + " bring?");
			gt.setFontStyle(Font.PLAIN);
			gt.println("");

			carrotInventory = Integer.parseInt(gt.getInputString("How many carrots?"));
			
			// The justification for the code block related to the carrot selection in the ‘kitchen’ choice is as follows: 

			// The int data type, in relation to the amount of carrots the user can bring, was chosen over a data type for decimal numbers (float or double) 
			// as it makes more sense for carrots to be carried in wholes rather than be in halves or in smaller pieces.

			// The logic of the following if statements are as follows:

			// - A check for the amount of carrots a user can bring was added because the bunny's bag cannot carry more carrots than what it can fit, 
			// as there are no other bags mentioned in the story. Thus, if carrotInventory is greater than maxCarrot (3), the input is invalid. 
			// Similarly, it makes sense for the bunnies to pack food for a long trip rather than not bring anything. 
			// Thus, if carrotInventory is less than minCarrot (1), the input is invalid.

			// Given that there are three different amounts of carrots a user can bring, three different reasons for bringing each amount of carrots 
			// were written. What code block is run depends on which condition the user's input directly satisfies (==), 
			// all of which are values that fall within the 1 - 3 threshold.

			// Having multiple if statements to show these different outcomes is the simplest way to meet the requirements as switch statements are not allowed.

			// This justification also applies to future code blocks where carrot selection arises.

			while (carrotInventory < minCarrot || carrotInventory > maxCarrot) {
				carrotInventory = Integer.parseInt(gt.getInputString("Please enter a number between 1 and 3!"));
			}

			if (carrotInventory == 1) {
				gt.println("Since " + bunnyMain
						+ " is not feeling very hungry, they only pack 1 carrot into their bag just for ");
				gt.println(bunnyFriend + " to eat before hopping back to their friend.");

			}

			else if (carrotInventory == 2) {
				gt.println(bunnyMain + " packs 2 carrots into their bag, one for each bunny, before hopping back ");
				gt.println("to their friend.");

			}

			else if (carrotInventory == 3) {
				gt.println("Thinking that " + bunnyFriend + " might be very hungry, " + bunnyMain
						+ " packs 3 carrots into their bag,");
				gt.println("one for each bunny and an extra just in case, before hopping back to their friend.");
			}

			gt.showMessageDialog("Press OK to proceed with the story!");
			gt.println("");
			gt.println("Both bunnies then decide to go to the bedroom, where they jump excitedly to " + bunnyMain
					+ "'s wardrobe.");
			gt.println("");
			gt.println(bunnyFriend + " sees " + bunnyMain
					+ "'s collection of different hats, ribbons, scarves, bandanas and ");
			gt.println("other accessories. " + bunnyMain + " lets " + bunnyFriend + " pick an accessory first.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("What should " + bunnyFriend + " wear?");
			gt.println("");
			gt.setFontStyle(Font.PLAIN);
			
			// The justification for the code block related to the accessory selection (for both the main bunny and the friend of the main bunny) 
			// in the ‘bedroom’ choice is as follows: 

			// The logic of the following if statements are as follows:

			// - A check for which accessory a user can choose was added because the bunny cannot wear an accessory that doesn't exist by 
			// choosing a number that isn't in the existing pool, or choose to be underdressed for their adventure!

			// Thus, if accessoryFriend is less than the minAccessoryChoice (1) or greater than maxAccessoryChoice (4), the input is invalid.

			// If the input is within the pool of accessories, a scenario will play out depending on which accessory is chosen as every accessory 
			// is to be worn differently. What code block is run depends on which condition the user's input directly satisfies (==). 
			// Including multiple if statements for the purpose of showing these different outcomes was the simplest way to meet requirements 
			// given that switch statements are not allowed.

			// This justification also applies to future code blocks where accessory selection arises.

			// The identifier name 'accessoryFriend' was chosen over a different name (like ‘'accessory') because it's a clearer name 
			// to show that the accessory in question is being chosen for the friend of the main bunny, since the main bunny also gets to select an accessory.

			int accessoryFriend = Integer.parseInt(gt.getInputString(
					"1 - A red ribbon \n2 - A blue scarf \n3 - A gold bow \n4 - A white flower accessory"));

			while (accessoryFriend < minAccessoryChoice || accessoryFriend > maxAccessoryChoice) {
				accessoryFriend = Integer.parseInt(gt.getInputString(
						"Please choose an accessory by entering the right number!\n\n1 - A red ribbon \n2 - A blue scarf \n3 - A gold bow \n4 - A white flower accessory"));
			}

			if (accessoryFriend == 1) {
				gt.println(bunnyFriend + " picks up the red ribbon and ties it around their left ear.");
				gt.println("The tails of the ribbon dangle on the side of " + bunnyFriend + "'s face.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");

			}

			else if (accessoryFriend == 2) {
				gt.println(bunnyFriend + " picks up the blue scarf and ties it around their neck.");
				gt.println("They feel very comfortable and warm in their new accessory.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");

			}

			else if (accessoryFriend == 3) {
				gt.println(bunnyFriend + " picks up the gold bow and clips it just under their right ear.");
				gt.println("The gold bow glitters a little bit when they stand in the light.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");
			}

			else if (accessoryFriend == 4) {
				gt.println(
						bunnyFriend + " picks up the white flower accessory and clips it just under their left ear.");
				gt.println("Little strings of pearl dangle off the plastic flower and shine in the light.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");
			}

			gt.println(bunnyFriend + " urges " + bunnyMain + " to pick something to wear too.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("What should " + bunnyMain + " wear?");
			gt.println("");
			gt.setFontStyle(Font.PLAIN);
			
			// The identifier name 'accessoryMain' was chosen over a different name (like 'accessory') because it's a clearer name to show that the accessory 
			// in question is being chosen for the main bunny of the story, since the friend of the main bunny also gets to select an accessory.

			int accessoryMain = Integer.parseInt(gt.getInputString(
					"1 - A white ribbon \n2 - A gold scarf \n3 - A blue bow \n4 - A red flower accessory"));

			while (accessoryMain < minAccessoryChoice || accessoryMain > maxAccessoryChoice) {
				accessoryMain = Integer.parseInt(gt.getInputString(
						"Please choose an accessory by entering the right number!\n\n1 - A white ribbon \n2 - A gold scarf \n3 - A blue bow \n4 - A red flower accessory"));
			}

			if (accessoryMain == 1) {
				gt.println(bunnyMain + " picks up the white ribbon and ties it around their left ear.");
				gt.println("The tails of the ribbon dangle on the side of " + bunnyMain + "'s face.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");

			}

			else if (accessoryMain == 2) {
				gt.println(bunnyMain + " picks up the gold scarf and ties it around their neck.");
				gt.println("They feel very comfortable and warm in their new scarf.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");

			}

			else if (accessoryMain == 3) {
				gt.println(bunnyMain + " picks up the blue bow and clips it just under their right ear.");
				gt.println("The blue bow glitters a little bit when they stand in the light.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");
			}

			else if (accessoryMain == 4) {
				gt.println(bunnyMain + " picks up the red flower accessory and clips it just under their left ear.");
				gt.println("Little strings of pearl dangle off the plastic flower and shine in the light.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");
			}

		// This is the other branch for the choice the user makes between visiting the kitchen or the bedroom first, where the user chooses to visit 
		// the bedroom first.

		// This code block is sequenced such that the user plays through the code related to the bedroom before moving onto the kitchen 
		// should they choose to visit the bedroom first. As someone cannot be in two places once, the user makes a choice to visit one 
		// before going to the other, and the story adjusts accordingly.

		}

		else if (choiceLocation.compareToIgnoreCase("bedroom") == 0) {
			gt.println("Both bunnies decide to go to the bedroom first, where they jump excitedly to " + bunnyMain
					+ "'s wardrobe.");
			gt.println("");
			gt.println(bunnyFriend + " sees " + bunnyMain
					+ "'s collection of different hats, ribbons, scarves, bandanas and other accessories.");
			gt.println(bunnyMain + " lets " + bunnyFriend + " pick an accessory first.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("What should " + bunnyFriend + " wear?");
			gt.println("");
			gt.setFontStyle(Font.PLAIN);

			int accessoryFriend = Integer.parseInt(gt.getInputString(
					"1 - A red ribbon \n2 - A blue scarf \n3 - A gold bow \n4 - A white flower accessory"));

			while (accessoryFriend < minAccessoryChoice || accessoryFriend > maxAccessoryChoice) {
				accessoryFriend = Integer.parseInt(gt.getInputString(
						"Please choose an accessory by entering the right number!\n\n1 - A red ribbon \n2 - A blue scarf \n3 - A gold bow \n4 - A white flower accessory"));
			}

			if (accessoryFriend == 1) {
				gt.println(bunnyFriend + " picks up the red ribbon and ties it around their left ear.");
				gt.println("The tails of the ribbon dangle on the side of " + bunnyFriend + "'s face.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");

			}

			else if (accessoryFriend == 2) {
				gt.println(bunnyFriend + " picks up the blue scarf and ties it around their neck.");
				gt.println("They feel very comfortable and warm in their new accessory.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");

			}

			else if (accessoryFriend == 3) {
				gt.println(bunnyFriend + " picks up the gold bow and clips it just under their right ear.");
				gt.println("The gold bow glitters a little bit when they stand in the light.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");
			}

			else if (accessoryFriend == 4) {
				gt.println(
						bunnyFriend + " picks up the white flower accessory and clips it just under their left ear.");
				gt.println("Little strings of pearl dangle off the plastic flower and shine in the light.");
				gt.println(bunnyFriend + " looks in the mirror and grins at how cute they look!");
				gt.println("");
			}

			gt.println(bunnyFriend + " urges " + bunnyMain + " to pick something to wear too.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("What should " + bunnyMain + " wear?");
			gt.println("");
			gt.setFontStyle(Font.PLAIN);

			int accessoryMain = Integer.parseInt(gt.getInputString(
					"1 - A white ribbon \n2 - A gold scarf \n3 - A blue bow \n4 - A red flower accessory"));

			while (accessoryMain < minAccessoryChoice || accessoryMain > maxAccessoryChoice) {
				accessoryMain = Integer.parseInt(gt.getInputString(
						"Please choose an accessory by entering the right number!\n\n\1 - A white ribbon \n2 - A gold scarf \n3 - A blue bow \n4 - A red flower accessory"));
			}

			if (accessoryMain == 1) {
				gt.println(bunnyMain + " picks up the white ribbon and ties it around their left ear.");
				gt.println("The tails of the ribbon dangle on the side of " + bunnyMain + "'s face.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");

			}

			else if (accessoryMain == 2) {
				gt.println(bunnyMain + " picks up the gold scarf and ties it around their neck.");
				gt.println("They feel very comfortable and warm in their new scarf.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");

			}

			else if (accessoryMain == 3) {
				gt.println(bunnyMain + " picks up the blue bow and clips it just under their right ear.");
				gt.println("The blue bow glitters a little bit when they stand in the light.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");
			}

			else if (accessoryMain == 4) {
				gt.println(bunnyMain + " picks up the red flower accessory and clips it just under their left ear.");
				gt.println("Little strings of pearl dangle off the plastic flower and shine in the light.");
				gt.println(bunnyMain + " blushes as they look in the mirror and see their cute new accessory.");
				gt.println(bunnyFriend + " tugs at their ear and teases them, and they blush even more!");
				gt.println("");
			}

			gt.showMessageDialog("Press OK to proceed with the story!");

			gt.println("Both bunnies then decide to go to the kitchen.");
			gt.println("With a bag in one of their paws, " + bunnyMain + " hops to their fridge and opens it.");
			gt.println(
					"They look at what they have available, and they see a pile of carrots that they freshly picked ");
			gt.println(
					"yesterday. " + bunnyMain + " looks down at their bag, and sees that they can only fit between ");
			gt.println("1 to 3 carrots before the bag becomes too full and too heavy.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("How many carrots should " + bunnyMain + " bring?");
			gt.setFontStyle(Font.PLAIN);
			gt.println("");

			carrotInventory = Integer.parseInt(gt.getInputString("How many carrots?"));

			while (carrotInventory < minCarrot || carrotInventory > maxCarrot) {
				carrotInventory = Integer.parseInt(gt.getInputString("Please enter a number between 1 and 3!"));
			}

			if (carrotInventory == 1) {
				gt.println("Since " + bunnyMain
						+ " is not feeling very hungry, they only pack 1 carrot into their bag just for ");
				gt.println(bunnyFriend + " to eat before hopping back to their friend.");
				gt.println("");
			}

			else if (carrotInventory == 2) {
				gt.println(bunnyMain + " packs 2 carrots into their bag, one for each bunny, before hopping back ");
				gt.println("to their friend.");
				gt.println("");

			}

			else if (carrotInventory == 3) {
				gt.println("Thinking that " + bunnyFriend + " might be very hungry, " + bunnyMain
						+ " packs 3 carrots into their bag,");
				gt.println("one for each bunny and an extra just in case, before hopping back to their friend.");
				gt.println("");
			}

		}

		gt.println("Now that they’re prepared for their journey, they hop out of " + bunnyMain + "'s house ");
		gt.println("and make their way to the forest.");
		gt.showMessageDialog("Press OK to proceed with the story!");
		gt.clear();
		gt.println(bunnyMain + " and " + bunnyFriend
				+ " stand at the edge of the forest. They cannot see far into the woods, ");
		gt.println("but they do see that the path ahead is split in two.");
		gt.println("");
		gt.setFontStyle(Font.BOLD);
		gt.println("Which way should the bunnies go?");
		gt.setFontStyle(Font.PLAIN);
		
		// The identifier name 'choiceFirstPath' was chosen over a different name (like 'path') because it better reflects that a choice is being made 
		// as to which path is to be taken by the bunnies on the first fork in the road.

		String choiceFirstPath = gt.getInputString("Should they go left or right?");
		gt.println("");
		
		// Much like the 'kitchen' and the 'bedroom' choice, this is one of two conditional statements that affect the story based on the user’s input. 
		// This is the first branch for the choice the user makes between taking the first left or right path into the woods.
		
		// The following justification for the use of if statements to take the left or right path into the woods is as follows:

		// Given that there are only two paths into the woods (“left” or “right”), if statements are the most appropriate and simplest choice 
		// for meeting the requirement that there be branches to the story, particularly when the two branches are substantially different 
		// enough that switch statements may be clunkier and harder to read.

		// This justification applies for this code block, and subsequent code blocks involving the choice between left or right paths into the woods, 
		// as represented by the following variables: the other branch of choiceFirstPath, choiceSecondPath, choiceThirdPath

		if (choiceFirstPath.compareToIgnoreCase("left") == 0) {
			gt.println(
					"Without looking back, both bunnies hop forward into the forest by taking the path to the left.");
			gt.println("The deeper they go in the forest, the darker it gets.");
			gt.println("After five minutes, they can barely see the ground underneath them, but they keep going.");
			gt.println("As long as they can see a way forward, there’s an end in sight.");
			gt.showMessageDialog("Press OK to proceed with the story!");
			gt.println("");
			gt.println(bunnyMain + " turns to " + bunnyFriend + " as they hop along. They look a bit scared.");
			gt.println(bunnyMain + " think it would be good to talk to them.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("What should " + bunnyMain + " do?");
			gt.setFontStyle(Font.PLAIN);
			gt.println("");
			
			// The logic of the following if statements are as follows:

			// - A check for which choice a user can choose was added because no values and thus actions are assigned outside of the 1 and 2 
			// (as in, to scare or cheer up your bunny friend).

			// Thus, if scareChoice is less than 1 (the comfort path) or greater than 2 (the scare path) then the input is invalid.

			// The identifier name 'scareChoice' was chosen over a different name (like 'cheerChoice') because it's a clearer name to show that 
			// the user is making the choice to either reduce the fright experienced by the friend, or to exacerbate it by scaring them again.

			// The following justification applies for this code block, subsequent code block represented by the “vineChoice” variable, 
			// and the one represented by “choicePerseverence”. 

			// Given that there are only two numbers that correspond with which path to take, two different scenarios were written for 
			// each path respectively. What code block is run depends on which condition the user's input directly satisfies (==), being 1 or 2.

			// If statements, over other statements like for loops or switches, are the simplest way to meet the requirements given that 
			// there are only two conditions that can be satisfied, which is sufficient enough to create the effect of a branching narrative.

			int scareChoice = Integer.parseInt(gt.getInputString("1 - Cheer them up \n2 - Scare them"));

			while (scareChoice < 1 || scareChoice > 2) {
				scareChoice = Integer.parseInt(gt.getInputString("Please choose whether to cheer up or scare "
						+ bunnyFriend + " by entering the right number! \n \n1 - Cheer them up \n2 - Scare them"));

			}

			if (scareChoice == 1) {
				gt.println(bunnyMain + " hops closer to " + bunnyFriend + " and tells them a bad joke.");
				gt.println("They laugh a little bit and start to relax, knowing they have a friend there with them.");

			}

			else if (scareChoice == 2) {
				gt.println("While " + bunnyFriend + " is distracted, " + bunnyMain
						+ " finds a stick on the ground and picks it up.");
				gt.println("They quietly poke " + bunnyFriend
						+ " on the shoulder with the stick and they jump with fright.");
				gt.println(bunnyFriend
						+ " looks angry, but is too shaken to yell at them, even more frightened than before.");

			}

		// Much like the 'kitchen' and the 'bedroom' choice, this is one of two conditional statements that affect the story based on the user’s input. 
		// This is the second branch for the choice the user makes between taking the first left or right path into the woods.
			
		}

		else if (choiceFirstPath.compareToIgnoreCase("right") == 0) {
			gt.println(
					"Without looking back, both bunnies hop forward into the forest by taking the path to the right.");
			gt.println("The deeper they go in the forest, the darker it gets.");
			gt.println("After five minutes, they can barely see the ground underneath them, but they keep going.");
			gt.println("As long as they can see a way forward, there's an end in sight.");
			gt.showMessageDialog("Press OK to proceed with the story!");
			gt.println("");
			gt.println("Both bunnies take their eyes away from the road in front of them to scan their surroundings.");
			gt.println("The canopy of the trees around them is very thick; they cannot see anything through them.");
			gt.println(
					"The bunnies, distracted by the mystery of the forest, do not see the large vine that suddenly moves ");
			gt.println("in their way.");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.println("What should the bunnies do?");
			gt.setFontStyle(Font.PLAIN);
			gt.println("");
			
			// The logic of the following if statements are as follows:

			// - A check for which choice a user can choose was added because no values and thus actions are assigned outside of the 1 and 2, 
			// the bunny is constrained to trip or not trip over the vine.

			// Thus, if vineChoice is less than 1 (the not trip path) or greater than 2 (the trip path) then the input is invalid.

			// The identifier name 'vineChoice' was chosen over a different name (like 'vine') because it's a clearer name to show that 
			// the user is making the choice regarding how to act about the vine in their way

			int vineChoice = Integer.parseInt(
					gt.getInputString("1 - See the vine and hop over it \n2 - Not see the vine and tumble over it"));

			while (vineChoice < 1 || vineChoice > 2) {
				vineChoice = Integer.parseInt(gt.getInputString(
						"Enter a number to make a choice! \n\n1 - See the vine and hop over it \n2 - Not see the vine and tumble over it"));
			}

			if (vineChoice == 1) {
				gt.println(bunnyMain
						+ " turns their attention back on the path ahead and sees a vine very close to them.");
				gt.println(bunnyMain + "'s eyes widen and they call out to " + bunnyFriend + " to stop just in time.");
				gt.println("They take their time examining the vine closely before hopping over it safely.");
			}

			else if (vineChoice == 2) {
				gt.println(bunnyMain + " starts to think they're seeing things running around in the trees,");
				gt.println("while " + bunnyFriend + "'s eyes are too focused on distant shadows, the little bunny’s");
				gt.println("own thoughts scaring them with what the shadows could be, to notice the road block ahead.");
				gt.println(
						"Both bunnies are shocked back to attention when they trip over the vine and fall to the ground with a thump.");
				gt.println(
						"They both jump up quickly and hop back to each other, confused and afraid of where the vine came from.");
				gt.println("Was something blocking the path before?");
			}
		}

		gt.showMessageDialog("Press OK to proceed with the story!");
		gt.println("");
		gt.println(
				"They keep hopping forward. Despite their eyes getting used to the darkness, it still seems so dark.");
		gt.println("It’s quiet too, except for the occasional gust of wind that rustles the leaves.");
		gt.println("This makes the sound of the bunnies’ stomach rumbling much louder than usual.");
		gt.println("Luckily, they packed food for the trip.");
		gt.println(bunnyMain + " rummages through their bag to grab some carrots for them to eat.");
		gt.println("");
		gt.setFontStyle(Font.BOLD);
		gt.println("How many carrots should the bunnies eat?");
		gt.setFontStyle(Font.PLAIN);
		gt.println("");
		
		// This code block was included so that it gives a practical use to the information provided earlier in the game (i.e. in the kitchen scene). 

		// The logic of the following if statements are as follows:

		// - A check for which choice a user can choose was added because the bunnies cannot eat carrots that they didn't bring nor 
		// can they choose not to eat when they are hungry and there's food available.

		// Thus, if carrotEat is greater than or less than what the bunnies brought with them, the input is invalid.

		// The logic of the nested if statements are as follows:

		// The nested if statements were included to account for the possibility that the user may not decide to eat all of the carrots
		// in their inventory, and that the bunnies themselves can only eat one carrot at a time.

		// If the user decided to bring three carrots, they freely have the choice to eat either one or two carrots. 
		// If the user brought two carrots, they have the choice to eat either one or two carrots. 
		// For the story to be logical, additional checks were needed involving the carrotInventory value to provide extra dialogue
		// depending on an earlier choice the user made. 

		// Thus, if the user brought three carrots but ate one, it wouldn’t simply run the dialogue related to the bunnies sharing a single carrot. 
		// Additional dialogue is given to say that remaining carrots would be saved for another day. This is also the case for whether:

		// The user brings three carrots but eats two.
		// The user bring two carrots but eats one. 

		// The identifier name 'carrotEat' was chosen over a different name (like carrotFood) because it's a clearer name to show that 
		// the user is making the choice of how many carrots the bunnies should eat.

		// Nested if statements are the simplest way of doing additional checks on an input as having a sequence of separate 
		// if statements would be clunkier and less efficient. 

		int carrotEat = Integer.parseInt(gt.getInputString("How many carrots do the bunnies eat?"));

		while (carrotEat > carrotInventory) {
			carrotEat = Integer.parseInt(gt.getInputString(
					"That was invalid! The bunnies can only eat carrots that they brought (" + carrotInventory + ")!"));
		}

		if (carrotEat <= 1) {
			gt.println(bunnyMain + " takes the carrot they packed for " + bunnyFriend + " and gives it to them.");
			gt.println(bunnyFriend + ", seeing that " + bunnyMain
					+ " isn't eating a carrot even though they are hungry, breaks");
			gt.println("the carrot in two.");
			gt.println(bunnyFriend + " hands one half to " + bunnyMain + " and though embarrassed, " + bunnyMain
					+ " accepts it graciously.");
			{
				if (carrotInventory == 2) {
					gt.println(bunnyMain + " keeps a carrot spare, which they can eat on the way back home.");
				} else if (carrotInventory == 3) {
					gt.println(bunnyMain + " keeps two carrot spares, which they can eat on the way back home.");
				}
			}
		} else if (carrotEat >= 2) {
			gt.println(bunnyMain + " takes out a carrot they pack for " + bunnyFriend
					+ " from their bag and gave it to them.");
			gt.println(bunnyFriend + " takes the carrot from them and thanks them for bringing food to eat.");
			gt.println(bunnyMain + ", seeing that " + bunnyFriend
					+ " is happily enjoying their carrot, takes a carrot out for them to eat.");
			if (carrotInventory == 3 && carrotInventory != 2) {
				gt.print(bunnyMain + " keeps a carrot spare, which they can eat on the way back home.");
			}
		}

		gt.println("");
		gt.showMessageDialog("Press OK to proceed with the story!");
		gt.clear();
		gt.println("As they nibble on their carrots, they see another fork in the road.");
		gt.println(
				"Both bunnies scan the paths, and they see that the path ahead looks equally as dark and equally as scary.");
		gt.println("");
		gt.setFontStyle(Font.BOLD);
		gt.println("Which way should the bunnies go?");
		gt.setFontStyle(Font.PLAIN);
		
		// The identifier name 'choiceSecondPath' was chosen over a different name to keep it consistent with prior naming conventions 
		// (i.e. choiceFirstPath), as the choice to be made in this instance is similar (as in, a choice to take the left or right path). 

		String choiceSecondPath = gt.getInputString("Should they go left or right?");
		gt.println("");

		if (choiceSecondPath.compareToIgnoreCase("left") == 0) {
			gt.println(bunnyMain + " points to the path going to the left and both of them wearily hop forward.");
		}

		else if (choiceSecondPath.compareToIgnoreCase("right") == 0) {
			gt.println(bunnyFriend + " points to the path going to the right and both of them wearily hop forward.");
		}

		gt.println("");
		gt.println("The deeper they go, it seems the thicket and the underbrush fight for space.");
		gt.println("They start to creep closer to the edges of the path.");
		gt.println("Before they know it, the bunnies see the path, again, split into two.");
		gt.println(bunnyMain + " looks at " + bunnyFriend + " and they seem to be very hesitant to move forward.");
		gt.println("");
		gt.setFontStyle(Font.BOLD);
		gt.println("Which way should the bunnies go?");
		gt.setFontStyle(Font.PLAIN);
		
		// The identifier name 'choiceThirdPath' was chosen over a different name to keep it consistent with prior naming conventions
		// (i.e. choiceFirstPath and choiceSecondPath), as this is yet another choice to be made as to whether to take the left or right path). 

		String choiceThirdPath = gt.getInputString("Should they go left or right?");
		gt.println("");

		if (choiceThirdPath.compareToIgnoreCase("left") == 0) {
			gt.println("Confused and scared, both bunnies keep hopping forward.");
			gt.println("Now, they must keep a better watch of the path in front of them.");
			gt.println(
					"Vines weave across the path, and the bunnies jump over them very carefully so they don’t get hurt.");
			gt.println("After navigating through those obstacles, their paws hurt badly.");
		}

		else if (choiceThirdPath.compareToIgnoreCase("right") == 0) {
			gt.println("Confused and scared, both bunnies keep hopping forward.");
			gt.println("Now, they must keep a better watch of the path in front of them.");
			gt.println("Branches and sharp stones are scattered across the path, and the bunnies jump over them");
			gt.println("very carefully so they don’t get hurt.");
			gt.println("After navigating through those obstacles, their paws hurt badly.");
		}

		gt.showMessageDialog("Press OK to proceed with the story!");
		gt.clear();
		gt.println("For their efforts, however, they do not see an exit, but another fork in the road.");
		gt.println("");
		gt.println("Before " + bunnyMain + " could ask " + bunnyFriend + " which direction they should go, "
				+ bunnyFriend + " is sitting");
		gt.println(
				"on the ground, tending to their paws. They look very tired and truthfully, " + bunnyMain + " is too.");
		gt.println("");
		gt.println(bunnyMain + " could feel that they are close to an exit, but " + bunnyFriend
				+ " asks if they could lie down ");
		gt.println("and rest for a bit.");
		gt.println("");
		gt.setFontStyle(Font.BOLD);
		gt.println("What should the bunnies do?");
		gt.setFontStyle(Font.PLAIN);
		gt.println("");
		
		// The identifier name 'choicePerseverence' was chosen over a different name because it indicates a choice to be made to fight 
		// through fatigue rather than choosing whether to rest or not.

		int choicePerseverence = Integer.parseInt(gt.getInputString("1 - Rest \n2 - Keep going!"));
		
		// These following series of code blocks represent the diverging endings that are determined by the user's inputs.

		// The logic of the following if statements are as follows:

		// - A check for which choice a user can choose was added because no values and thus actions are assigned outside of the 1 and 2, 
		// the bunny is constrained to either rest or keep going.

		// Thus, if choicePerseverence is less than 1 (the rest path) or greater than 2 (the perseverance path),  then the input is invalid.

		// If statements are the simplest and most effective way to satisfy requirements as there are only two possible endings 
		// (with an ending assigned to ‘1’ and ‘2’) that run depending on what condition the user’s input directly satisfies (==), 
		// and not multiple possibilities that may perhaps be best covered by a switch statement.

		while (choicePerseverence < 1 || choicePerseverence > 2) {
			choicePerseverence = Integer.parseInt(
					gt.getInputString("Please enter a number to make a choice! \n\n1 - Rest \n2 - Keep going!"));
		}

		if (choicePerseverence == 1) {
			gt.println(bunnyMain + " lies down next to " + bunnyFriend + ".");
			gt.println(
					"Even though they aren’t shivering because they are cold, they snuggle up together so they could keep warm.");
			gt.println(
					"The ground underneath them is very rough and rocky, but they do their best to keep comfortable.");
			gt.println("");
			gt.println("As they tend to their sore paws, they start to fall asleep.");
			gt.println("");
			gt.println("Their eyelids begin to shut slowly.");
			gt.println("");
			gt.println("The last thing the two bunnies see is the darkness of the woods that surround them,");
			gt.println("draped over them like a cold blanket...");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.setFontSize(45);
			gt.println("FIN.");

		}

		else if (choicePerseverence == 2) {
			gt.println(bunnyMain + " tugs gently on " + bunnyFriend + "'s ears, urging them to keep going.");
			gt.println(bunnyFriend + " protests, complaining that their paws really hurt, but " + bunnyMain
					+ " is persistent.");
			gt.println("They know something is waiting for them on the other side!");
			gt.println("");
			gt.println(bunnyFriend + " groans and gets back up on their paws.");
			gt.println(bunnyMain + " holds one of " + bunnyFriend + "'s paws and they walk together,");
			gt.println("helping each other out to hop over obstacles.");
			gt.println("");
			gt.println("Though both bunnies are extremely tired, they notice that the road starts to look clearer,");
			gt.println(
					"free of rocks and branches. Vines become less and less frequent until it looks as if they have ");
			gt.println(
					"retreated back into the shadows. Catching their second wind, both of the bunnies’ ears perk up and");
			gt.println("they bound up the path.");
			gt.println("");
			gt.println("Slowly, the path underneath them no longer hurts to walk on.");
			gt.println("");
			gt.println("Slowly, the bunnies could see the canopy above them thin out.");
			gt.println("");
			gt.println("Slowly, light starts streaming in.");
			gt.println("");
			gt.println(
					"Both bunnies look up in awe, their eyes sparkling with glee. They hop even faster up the road;");
			gt.println("their legs moving faster than they could hop, but somehow, neither of them trip.");
			gt.println(bunnyMain
					+ " sees a clearing up ahead, light bursting through like the sun rising after a long night.");
			gt.println("");
			gt.println("They run faster and faster until...");
			gt.showMessageDialog("Press OK to proceed with the story!");
			gt.clear();
			gt.println("They jump out of the forest and onto a brilliant, green field with the softest grass.");
			gt.println("Rolling hills appear in the distance, even greener than the ground beneath them.");
			gt.println("Both bunnies jump and run around in circles, grateful that they can finally plant their paws");
			gt.println(
					"on something comfortable. As they explore more of the field, they see different types of flowers");
			gt.println("of every imaginable colour growing around them.");
			gt.println("They take their time examining each one, and " + bunnyMain
					+ " digs some samplings out of the ground");
			gt.println("to bring back for their own garden.");
			gt.println("");
			gt.println(
					"The two bunnies hop around happily, enjoying the sun and the flowers, until the sun starts to set.");
			gt.println("");
			gt.println("Tired from their adventure, they decide to stay on the field for the night.");
			gt.println(
					"Though gentle winds make them shiver a little, both bunnies curl up next to each other to keep warm.");
			gt.println("Shortly after, both bunnies become drowsier, and before");
			gt.println(bunnyMain + " could even greet " + bunnyFriend + " goodnight, they are already asleep.");
			gt.println("");
			gt.println(bunnyMain + " looks up at the sky with their tired eyes.");
			gt.println("");
			gt.println(
					"As their eyelids begin to shut on their own, the last thing they see is the stars twinkling above them...");
			gt.println("");
			gt.setFontStyle(Font.BOLD);
			gt.setFontSize(45);
			gt.println("FIN.");
			gt.setXY(80, 525);
			
			// M.Y. Dungca, "Sleepy Bunny", unpublished, August 2020.
			
			gt.addImageIcon("SleepyBunny.png");

		}

	}
}