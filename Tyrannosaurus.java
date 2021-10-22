//****************************************************************
//Author: Prassana Kamalakannan
//Filename: Tyrannosaurus.java
//DateModified: 29/10/2017
//****************************************************************

public class Tyrannosaurus extends Dinosaur
{
    //PRIVATE CLASSFIELDS
    private double biteForce;

    //CONSTRUCTORS
    //***************************************************************
    // Default constructor:
    // IMPORT: none
    // EXPORT: none
    // ASSERTION: Constructs object with default state
    //****************************************************************
    public Tyrannosaurus()
    {
        super();
        biteForce = 501.0;
    }

    //*************************************************************************
    //Alternate Constructor:
    //IMPORT: inName(String), inMass(real), inGenome(String)
    //EXPORT: none
    //ASSERTION: Constructs object with imported values provided they are valid
    //*************************************************************************
    public Tyrannosaurus(String inName, double inMass, double, inBiteForce)
    {
        super(inName, inMass);
        if (validateBiteForce(biteForce))
        {
            biteForce = inBiteForce;
        }
        else 
        {
            throw IllegalArgumentException("invalid import arguments");
        }//ENDIF
    }
  
     //**************************************************************************
     //Copy Constructor:
     //IMPORT: inDinosaur(Dinosaur)
     //EXPORT: none
     //ASSERTION: Creates object with identical state as the import
     //**************************************************************************
    public Tyrannosaurus(Tyrannosaurus inTyrannosaurus)
    {
        super(inTyrannosaurus);
        biteForce = inTyrannoaurus.getBiteForce();
    }

    //MUTATORS
    //***************************************************************************
    //SUBMODULE setHasTailFin
    //IMPORT: inHasTailFin
    //EXPORT: none
    //ASSERSTION: sets hasTailFin to inHasTailFin if import is valid
    //***************************************************************************
    public void setBiteForce(double inBiteForce)
    {
        if (validateBiteForce(inBiteForce))
        {
            biteForce = inBiteForce;
        }
        else
        {
            throw IllegalArgumentException("invalid real number for biteForce");
        }//ENDIF
    }
 
    //ACCESSORS
    //**************************************************************************
    //SUBMODULE calcEnclosureSize
    //calculates enclosure size and returns value to abstract method in Dinosaur
    //***************************************************************************
    public double calcEnlcosureSize()
    {
        Math.log2(mass)*biteForce*10.0;
    }

    //***************************************************************************
    //SUBMODULE getName
    //IMPORT: none
    //EXPORT: name
    //***************************************************************************
    public double getBiteForce()
    {
        return biteForce;
    }

    //***************************************************************************
    //SUBMODULE equals
    //IMPORT: inObj(Object)
    //EXPORT: isEqual(boolean)
    //ASSERTION: checks for equivalence between two objecct of the same class
    //***************************************************************************
    public boolean equals(Object inObj)
    {
        boolean isEqual = false;
        if (inObj instanceof Tyrannosaurus)
        { 
            Tyrannosaurus inTyrannosaurus = (Tyrannosaurus)inObj;
            if (super.equals(inTyrannosaurus))
            {
                if (biteForce.equals(inTyrannosaurus.getBiteForce()))
                {
                    isEqual = true;
                }//ENDIF 
            }//ENDIF
        }//ENDIF
    }

    //***************************************************************************
    //SUBMODULE clone
    //IMPORT: none
    //EXPORT: cloneDinosaur(Dinosaur)
    //ASSERTION: creates clone of object
    //***************************************************************************
    public Tyrannosaurus clone()
    {
        return new Tyrannosaurus(this);
    }

    public String toString()
    {
        return (super.toString + "biteForce: " + biteForce);
    }

    //PRIAVTE SUBMODULES
    //***************************************************************************
    //All private submodules validate the class fields and returns a boolean value
    //***************************************************************************
    private boolean validateBiteForce(double inBiteForce)
    {
        boolean valid;
        if (inBiteForce > 500.0)
        {
            valid = true;
        }
        else
        {
            valid = false;
        }//ENDIF
    } 
}//END CLASS    
