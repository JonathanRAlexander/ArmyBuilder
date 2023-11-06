public class Unit
	{
	private String faction;
	private String name;
	private String type;
	private int powerRating;
	private int models;
	private int wounds;
	private int highestShoot;
	private int highestMelee;
	

public Unit(String f, String n, String t, int p, int m ,int w, int hs, int hm)
		{
		faction = f;
		name = n;
		type = t;
		powerRating = p;
		models = m;
		wounds = w;
		highestShoot = hs;
		highestMelee = hm;
		}

	public String getFaction()
		{
		return faction;
		}

	public void setFaction(String faction)
		{
		this.faction = faction;
		}
	
	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}
	
	public String getType()
		{
		return type;
		}

	public void setType(String type)
		{
		this.type = type;
		}
	
	public int getPowerRating()
		{
		return powerRating;
		}

	public void setPowerRating(int powerRating)
		{
		this.powerRating = powerRating;
		}
	
	public int getModels()
		{
		return models;
		}

	public void setModels(int models)
		{
		this.models = models;
		}
	
	public int getWounds()
		{
		return wounds;
		}

	public void setWounds(int wounds)
		{
		this.wounds = wounds;
		}
	
	public int getHighestShoot()
		{
		return highestShoot;
		}

	public void setHighestShoot(int highestShoot)
		{
		this.highestShoot = highestShoot;
		}
	
	public int getHighestMelee()
		{
		return highestMelee;
		}

	public void setHighestMelee(int highestMelee)
		{
		this.highestMelee = highestMelee;
		}
	
	

	}
