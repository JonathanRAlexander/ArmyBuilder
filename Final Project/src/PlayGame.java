import java.util.Scanner;
public class PlayGame
	{
static String faction;
static String armyName;
static int armySize;
		public static void main(String[] args)
			{
			//Thanks for the best class of the semester!!!!!!!
				System.out.println("The army that you have created is a ranged army. This means that your army has very strong ranged weapons and its main\n strength lies in its ability to crush the enemy from far away. The strategy guide for this playstlye is as follows: Start battle rounds one \n and two wil the main goal of securing high up vantage points and places of cover, so that your armies ranged \n capabilities can be maximized.  This risk of wasting precious turns must be paid off in battle rounds three,\n four, five, and any extra added rounds. In these subsequent battle rounds, spend all resources on gunning\n the enemy down, preventing them from securing objective markers, whilst staying protected in cover. Once the\n enemy has been whittled down enough ( to around 50 - 65% of its original army size), bring your troops\n out of cover to secure the objective points and win the game. ");
				
				System.out.println("Hello worlds");
				
				Scanner userArmyNameInput = new Scanner(System.in);
				System.out.println("What is the name of your Army? (NOT the faction)");
				 armyName = userArmyNameInput.nextLine();
				
				
				Scanner userArmySizeInput = new Scanner(System.in);
				System.out.println("How many units are in your army?");
				armySize = userArmySizeInput.nextInt();
				
				
				askFaction();
				
				System.out.println("Now we are going to be adding in your units into your army one at a time. Rember you can only have one warlord");
			
				for(int i = 0; i<armySize; i++)
					{
						System.out.println();
						System.out.println("Alright, next unit");
						System.out.println();
						askUnit();
					}
				setFactions();
				
				displayArmy();
				
				displayPlaystyleBreakdown();
				
			}
		
		
		public static void askFaction()
		    {
		    	Scanner userStringInput = new Scanner(System.in);
				System.out.println("What faction is your army in?");
				 faction = userStringInput.nextLine();
		    }
		
		public static void askUnit()
		{
			
			Scanner userNameInput = new Scanner(System.in);
			System.out.println("What is the name of the unit");
			String unitName = userNameInput.nextLine();
			
			Scanner userTypeInput = new Scanner(System.in);
			System.out.println("What is the type of the unit (warlord, character, infantry, vehicle, machine of war).");
			String unitType = userTypeInput.nextLine();
			
			Scanner userPowerRatingInput = new Scanner(System.in);
			System.out.println("What is the power rating of the unit");
			int unitPowerRating = userPowerRatingInput.nextInt();
			
			Scanner userModelNumber = new Scanner(System.in);
			System.out.println("How many models are the unit?");
			int unitModelNumber = userModelNumber.nextInt();
			
			Scanner userWounds = new Scanner(System.in);
			System.out.println("What is the wounds charcteristic of the unit?");
			int unitWounds = userWounds.nextInt();
			
			Scanner userHighestShoot = new Scanner(System.in);
			System.out.println("Input the highest strength characteristic out of all the strength characteristics of the ranged weapons that this unit is equipped with. (If the unit has no ranged weapons, input 0.");
			int unitHighestShoot = userHighestShoot.nextInt();
			
			Scanner userHighestMelee = new Scanner(System.in);
			System.out.println("Input the highest strength characteristic out of all the strength characteristics of the melee weapons that this unit is equipped with. (If the unit has no melee weapons, input 0.");
			int unitHighestMelee = userHighestMelee.nextInt();
			
			
			Army.army.add(new Unit("", unitName, unitType, unitPowerRating,unitModelNumber, unitWounds, unitHighestShoot, unitHighestMelee));
		}
		
		public static void setFactions()
		{
			for(int i = 0; i<Army.army.size(); i++ )
				{
					Army.army.get(i).setFaction(faction);
				}
			
		}
		
		public static void displayArmy()
		{
			System.out.println("Here is your army's descirption:");
			System.out.println();
			
			if(Army.army.get(1).getFaction().equals("Space Marines"))
				{
					System.out.println("Your Space Marine army named " + armyName + " will restore order to the universe and banish the forces of chaos and xenos in the name of The Emperor");
				}
			else if(Army.army.get(1).getFaction().equals("Astra Militarum"))
				{
					System.out.println("Your Imperial Guard army named " + armyName + " will overwhelm your enemies with vast amounts of troops and brute strength in numbers.");
				}
			else if(Army.army.get(1).getFaction().equals("Adeptus Mechanicus"))
				{
					System.out.println("Your Adeptus Mechanicus army named " + armyName  + " will honor the Machine God with great valor and revolutionize technology across the Imperium.");
				}
			else if(Army.army.get(1).getFaction().equals("Chaos Space Marines"))
				{
					System.out.println("Your Chaos Space Marine army named " + armyName + " will spread the malevolence of the Dark Gods far and wide and infect the Imperium with evil.");
				}
			else if(Army.army.get(1).getFaction().equals("Death Guard"))
				{
					System.out.println("Your Death Guard amry named " + armyName + " will spread plague and disease in honor of the Plague God, Nurgle. The universe will rot in his delight.");
				}
			else if(Army.army.get(1).getFaction().equals("Chaos Daemons"))
				{
					System.out.println("Your Chaos Daemon army named "+armyName+ " will run amok the galaxy spreading havoc, serving as the direct spawns of the Dark Gods.");
				}
			else if(Army.army.get(1).getFaction().equals("Tyranids"))
				{
					System.out.println("Your Tyranid army named " + armyName + " will consume the stars, satisfying its never-ending hunger for flesh and destruction.");
				}
			else if(Army.army.get(1).getFaction().equals("Aeldari"))
				{
					System.out.println("Your Aeldari army named " + armyName + " will reunite its kingdom once and for all and rule the stars in its former glory.");
				}
			else if(Army.army.get(1).getFaction().equals("Orks"))
				{
					System.out.println("Your Ork army named " + armyName + " will create mass chaos and destruction in honor of the WAAAAAGH. Havoc will be wrought across the galaxy.");
				}
			else if(Army.army.get(1).getFaction().equals("Necrons"))
				{
					System.out.println("Your Necron army named " + armyName + " will march across the stars in their robotic warships and restore the Necron kingdom to its original pre-historic glory. ");
				}
			else if(Army.army.get(1).getFaction().equals("Tau Empire"))
				{
					System.out.println("Your Tau Empire army named " + armyName + " will rule the stars and restore The Greater Good across all species.");
				}
			
			else 
				{
				System.out.println("Your " +  Army.army.get(1).getFaction()+" army named, " + armyName + " will conquer the stars with ease.");
				}
			
			System.out.println("Here are the units in your army:");
			System.out.println();
			int j = 1;
			for(int i = 0; i<armySize; i++)
				{
					System.out.println(j +". " + Army.army.get(i).getName() + "(" + Army.army.get(i).getType() + ", "+ Army.army.get(i).getPowerRating() + " Power Rating)" );
					System.out.println();
					j++;
				}
		}
		
		public static void displayPlaystyleBreakdown()
		{
			int armyShootStrength = 0;
			int armyMeleeStrength = 0;
			int woundCount = 0;
			int hordeCount = 0;
			
			
			for(int i = 0; i<armySize; i++)
				{
					armyShootStrength += Army.army.get(i).getHighestShoot();
				}
			armyShootStrength = armyShootStrength / armySize;
			
			for(int i = 0; i<armySize; i++)
				{
					armyMeleeStrength += Army.army.get(i).getHighestMelee();
				}
			armyMeleeStrength = armyMeleeStrength / armySize;
			
			for(int i = 0; i<armySize; i++)
				{
					woundCount += Army.army.get(i).getWounds();
				}
			woundCount = woundCount / armySize;
			
			for(int i = 0; i<armySize; i++)
				{
					hordeCount += Army.army.get(i).getModels();
				}
			hordeCount = hordeCount / armySize;
			
			if(armyShootStrength >= 7)
				{
					System.out.println("The army that you have created is a ranged army. This means that your army has very strong ranged weapons and its main\n strength lies in its ability to crush the enemy from far away. The strategy guide for this playstlye is as follows: Start battle rounds one \n and two wil the main goal of securing high up vantage points and places of cover, so that your armies ranged \n capabilities can be maximized.  This risk of wasting precious turns must be paid off in battle rounds three,\n four, five, and any extra added rounds. In these subsequent battle rounds, spend all resources on gunning\n the enemy down, preventing them from securing objective markers, whilst staying protected in cover. Once the\n enemy has been whittled down enough ( to around 50 - 65% of its original army size), bring your troops\n out of cover to secure the objective points and win the game. ");
				}
			
			
			
			}
			
				
				
				
				
				
				
				
				
				
				
			

	}
