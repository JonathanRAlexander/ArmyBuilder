import java.util.Scanner;
public class PlayGame
	{
static String faction;
static String armyName;
static int armySize;
static Scanner userStringInput = new Scanner(System.in);
static Scanner userIntInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				
				
				System.out.println("What is the name of your Army? (NOT the faction)");
				 armyName = userStringInput.nextLine();
				
				
				
				System.out.println("How many units are in your army?");
				armySize = userIntInput.nextInt();
				
				
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
				
				//displayArmy();
				
				//displayPlaystyleBreakdown();
				
				System.out.println("Press enter to continue and track your armies wounds in a battle.");
				String fake = userStringInput.nextLine();
boolean playing  = true;
				while(playing == true)
					{
						
				displayWoundsAndModels();
					
					}
			}
		
		
		public static void askFaction()
		    {
		    	Scanner userStringInput = new Scanner(System.in);
				System.out.println("What faction is your army in?");
				 faction = userStringInput.nextLine();
		    }
		
		public static void askUnit()
		{
			
			
			System.out.println("What is the name of the unit");
			String unitName = userStringInput.nextLine();
			
		
			System.out.println("What is the type of the unit ('Warlord', 'Character', 'Infantry', 'Vehicle', 'Machine of War').");
			String unitType =userStringInput .nextLine();
			
	
			System.out.println("What is the power rating of the unit");
			int unitPowerRating = userIntInput.nextInt();
			
			
			System.out.println("How many models are the unit?");
			int unitModelNumber = userIntInput.nextInt();
			
			
			System.out.println("What is the wounds charcteristic of the unit?");
			int unitWounds = userIntInput.nextInt();
			
			
			System.out.println("Input the highest strength characteristic out of all the strength characteristics of the ranged weapons that this unit is equipped with. (If the unit has no ranged weapons, input 0.");
			int unitHighestShoot = userIntInput.nextInt();
			
			
			System.out.println("Input the highest strength characteristic out of all the strength characteristics of the melee weapons that this unit is equipped with. (If the unit has no melee weapons, input 0.");
			int unitHighestMelee = userIntInput.nextInt();
			
			
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
			
			
			
			System.out.println("Would you like to see the strategic breakdown of your army?");
			String answer = userStringInput.nextLine();
			if(answer.equals("yes") || answer.equals("Yes"))
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
				System.out.println("The army that you have created is a ranged army. This means that your army has very strong ranged weapons and its main\n strength lies in its ability to crush the enemy from far away. The strategy guide for this playstlye is as follows:\n Start battle rounds one and two wil the main goal of securing high up vantage points and places of cover, so that your armies ranged \n capabilities can be maximized.  This risk of wasting precious turns must be paid off in battle rounds three,\n four, five, and any extra added rounds. In these subsequent battle rounds, spend all resources on gunning\n the enemy down, preventing them from securing objective markers, whilst staying protected in cover. Once the\n enemy has been whittled down enough ( to around 50 - 65% of its original army size), bring your troops\n out of cover to secure the objective points and win the game.");
				}
			
			if(armyMeleeStrength>=7)
			{
				System.out.println("The army you have created is a melee based army. This means that your army has strength in getting up close and personal\n with your enemy. With this army, you want to strategize throughout every battle round to get your units constantly in cover.\n Secure objective markers early and then when the enemy is close enough, charge in and destroy the enemy with your strong melee\n weapons.");
			}
			
			if(woundCount>=5)
			{
				System.out.println("Your army is also an elite unit army. This means that you have units that are few in count but high in quality. Your strategy will\n be to maximize the strength of your few units in battle. place them in key strategic places and use your army's strength to take\n out the strong pieces of your opponent's army.");
			}
			
			if(hordeCount>7)
			{
				System.out.println("Your army is also considered a 'horde army.' This means that your army has lots of strength in its numbers. The strategy with this\n type of army is to play extremely aggresive and overwhelm the enemy. Every battle round you should be pressing the attack in order\n to eventually trample the enemy army. This is a high risk / high reward army and can vary in success based on the type of army you\n are playing against.");
			}
			
			else if(hordeCount<7 && woundCount <5 && armyMeleeStrength<7 && armyShootStrength<7)
				{
					System.out.println("Congratulations, you have made yourself a bland army with no significant strengths. You are probably awful at this game.");
				}
			
				}
			
			else if(answer.equals("no") || answer.equals("No"))
				{
					System.out.println("Ok! Moving on.");
				}
	
			
	}

		public static void displayWoundsAndModels()
		{
			int j = 1;
			for(int i = 0; i<armySize; i++)
				{
					if(Army.army.get(i).getModels()>1)
						{
					System.out.println(j +". " + Army.army.get(i).getName() + "  has "+ Army.army.get(i).getModels()+ " models left"  );
						}
					
					else if(Army.army.get(i).getModels()==1)
						{
					System.out.println(j +". " + Army.army.get(i).getName() + "  has "+ Army.army.get(i).getWounds()+ " wounds left"  );
						}
					
					System.out.println();
					j++;
					
					 
				}
			
			System.out.println("Which unit would you like to change? (input the number that the unit is next to in the list above.");
			int unitChanged = userIntInput.nextInt();
			unitChanged = unitChanged-1;
			
			System.out.println("How much? (Input a number and if you would like to subtract then input a negative number. For example, input '-1' to subtract one.)");
			int changeValue = userIntInput.nextInt();
			for(int i = 0; i<armySize; i++)
			{
			if(Army.army.get(i).getModels()>1)
				{
					Army.army.get(unitChanged).setModels(Army.army.get(unitChanged).getModels()+changeValue);
				}
			
			else if(Army.army.get(i).getModels()==1)
				{
					Army.army.get(unitChanged).setWounds(Army.army.get(unitChanged).getWounds()+changeValue);
				}
			}
		}
				
				
	}
