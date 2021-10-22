//****************************************************************
//Author: Prassana Kamalakannan
//Filename: Dinosaur.java
//DateModified: 29/10/2017
//****************************************************************

public abstract class Dinosaur
{
    //Private classfields
    private String name;
    private double mass;
    private Genome genome;

    //CONSTRUCTORS
    //***************************************************************
    // Default constructor:
    // IMPORT: none
    // EXPORT: none
    // ASSERTION: Constructs object with default state
    //****************************************************************
    
    public Dinosaur()
    {
        name = "unknown";
        mass = 0.0;
        genome = new Genome();
    }//END Dinosaur

    //*************************************************************************
    //Alternate Constructor:
    //IMPORT: inName(String), inMass(real), inGenome(String)
    //EXPORT: none
    //ASSERTION: Constructs object with imported values provided they are valid
    //*************************************************************************
    public Dinosaur(String inName, double inMass, String inGenome)
    {
        if ((validateName(name)) && (validateMass(mass)) && (validateGenome(genome)))
        {
            name = inName;
            mass = inMass;
            genome = new Genome(inGenome);//Making a copy
        }//ENDIF
    }//Dinosaur
    
    //**************************************************************************
    //Copy Constructor:
    //IMPORT: inDinosaur(Dinosaur)
    //EXPORT: none
    //ASSERTION: Creates object with identical state as the import
    //**************************************************************************
    public Dinosaur(Dinosaur inDinosaur)
    {
        name = inDinosaur.getName();
        mass = inDinosaur.getMass();
        genome = inDinosaur.getGenome();
    }//END Dinosaur

    //MUTATORS:
    //***************************************************************************
    //SUBMODULE setName
    //IMPORT: inName(String)
    //EXPORT: none
    //ASSERSTION: sets name to inName if valid 
    //***************************************************************************
    public void setName(String inName)
    {
        if (validateName(inName))
        {
            name = inName;
        }
        else
        {
            throw new IllegalArguementException("Invalid name");
        }//ENDIF
    }//END setName
            
    //***************************************************************************
    //SUBMODULE setMass
    //IMPORT: inMass(real)
    //EXPORT: none
    //ASSERTION: sets mass to inMass if valid
    //***************************************************************************
    public void setMass(double inMass)
    {
        if (validateMass(inMass))
        {
            mass = inMass;
        }
        else
        {
            throw new IllegalArguementException("Invalid mass");
        }//ENDIF
    }//END setMass

    //***************************************************************************
    //SUBMODULE setGenome
    //IMPORT: inGenome(String)
    //EXPORT: none
    //ASSERTION: sets genome to inGenome if valid
    //***************************************************************************
    public void setGenome(String inGenome)
    {
        if (validateGenome(inGenome))
        {
            genome = inGenome;
        }
        else
        {
            throw new IllegalArguementException("Invalid genome");
        }//ENDIF
    }//END setGenome

    //ACCESSORS
    //***************************************************************************
    //ABSTRACT SUBMODULE calcEnclosureSize
    //IMPORT: -
    //EXPORT: enclosureArea(real)
    //ASSERTION: abstract method that calls calcEnclosureSize from sub classes
    //***************************************************************************
    public abstract double calcEnclosureSize();
    //END ABSTRACT SUBMODULE

    //***************************************************************************
    //SUBMODULE getName
    //IMPORT: none
    //EXPORT: name
    //***************************************************************************
    public String getName()
    {
        return name;
    }//END getName

    //***************************************************************************
    //IMPORT: none
    //EXPORT: mass
    //***************************************************************************  
    public double getMass()
    {
        return mass;
    }//END getMassi
    
    //***************************************************************************
    //SUBMODULE getGenome
    //IMPORT: none
    //EXPORT: genome
    //***************************************************************************
    public String getGenome()
    {
        return genome;
    }//END getGenome

    //***************************************************************************
    //SUBMODULE equals
    //IMPORT: inObj(Object)
    //EXPORT: isEqual(boolean)
    //ASSERTION: checks for equivalence between two objecct of the same class
    //***************************************************************************
    public boolean equals(Object inObj) 
    {
        boolean isEqual = false;
        if (inObj instanceof Dinosaur)
        {
            boolean isEqual = false;
            Dinosaur inDinosaur = (Dinosaur)inObj;
            isEqual = (name.equals(inDinosaur.getName()))&&(mass == inDinosaur.getMass())&&(genome.equals(inDinosaur.getGenome()));
        }//ENDIF
        return isEqual;
    }//END equals

    //***************************************************************************
    //SUBMODULE clone
    //IMPORT: none
    //EXPORT: cloneDinosaur(Dinosaur)
    //ASSERTION: creates clone of object
    //***************************************************************************
    public abstract Dinosaur clone();
 
    public String toString()
    {
        return ("name: " + name + "mass: " + mass + "genome: " + genome.toString());
    }//END toString

    //PRIVATE SUBMODULES
    //***************************************************************************
    //All private submodules validate the class fields and returns a boolean value
    //***************************************************************************
    private boolean validateName(String inName)
    {
        boolean valid;
        if (inName.equals(""))
        {
            valid = false;
        }
        else
        {
            valid = true;
        }//ENDIF
    }//END validateName
    
    private boolean validateMass(double inMass)
    {
        boolean valid;
        if (inMass < 0.0)
        {
            valid = false;
        }
        else
        {
            valid = true;
        }//ENDIF
        return valid;
    }//END validateMass 
    //*****************************************************************************
}//END CLASS
