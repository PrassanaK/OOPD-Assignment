//****************************************************************
//Author: Prassana Kamalakannan
//Filename: Plesiosaur.java
//DateModified: 29/10/2017
//****************************************************************

public class Plesiosaur extends Dinosaur
{
    //PRIVATE CLASSFIELDS
    private boolean hasTailFin;

    //CONSTRUCTORS
    //***************************************************************
    // Default constructor:
    // IMPORT: none
    // EXPORT: none
    // ASSERTION: Constructs object with default state
    //****************************************************************
    public Plesiosaur()
    {
        super();
        hasTailFin = false;
    }//END Default

    //*************************************************************************
    //Alternate Constructor:
    //IMPORT: inName(String), inMass(real), inGenome(String)
    //EXPORT: none
    //ASSERTION: Constructs object with imported values provided they are valid
    //*************************************************************************
    public Plesiosaur(String inName, double inMass, boolean inHasTailFin)
    { 
        super(inName, inMass);
        if (validateHasTailFin(hasTailFin))
        {
            hasTailFin = inHasTailFin;
        }
        else
        {
            throw IllegalArgumentException("invalid import values");
        }//ENDIF
    }//END Alternate

    //**************************************************************************
    //Copy Constructor:
    //IMPORT: inDinosaur(Dinosaur)
    //EXPORT: none
    //ASSERTION: Creates object with identical state as the import
    //**************************************************************************
    public Plesiosaur(Plesiosaur inPlesiosaur)
    {
        super(inPlesiosaur);
        hasTailFin = inPlesiosaur.getHasTailFin(); 
    }//END Copy
 
    //MUTATORS
    //***************************************************************************
    //SUBMODULE setHasTailFin
    //IMPORT: inHasTailFin
    //EXPORT: none
    //ASSERSTION: sets hasTailFin to inHasTailFin if import is valid
    //***************************************************************************
    public void setHasTailFin(boolean inHasTailFin)
    {
        if (validateHasTailFin(inHasTailFin))
        {
            hasTailFin = inHasTailFin;
        } 
        else
        {
            throw IllegalArgumentException("invalid boolean value for hastailFin");
        }//ENDIF
       
    }//END setHasTailFin
    
    //ACCESSORS
    //**************************************************************************
    //SUBMODULE calcEnclosureSize 
    //calculates enclosure size and returns value to abstract method in Dinosaur
    //***************************************************************************
    public double calcEnclosureSize()
    {
        mass*(Math.PI)*(10^3);
    }

    //***************************************************************************
    //SUBMODULE getName
    //IMPORT: none
    //EXPORT: name
    //***************************************************************************
    public boolean getHasTailFin()
    {
        return hasTailFin;
    }
  
     //***************************************************************************
     //SUBMODULE equals
     //IMPORT: inObj(Object)
     //EXPORT: isEqual(boolean)
     //ASSERTION: checks for equivalence between two objecct of the same class
     //***************************************************************************
    public boolean equals(Object inObj) 
    {
        isEqual = false;
        if (inObj instanceof Plesiosaur)
        {
            Plesiosaur inPlesiosaur = (Plesiosaur)inObj;
            if (super.equals(inPlesiosaur))
            {
                if (hasTailFin == inPlesiosaur.getHasTailFin())
                {
                    isEqual = true;
                }//ENDIF
            }//ENDIF
        }//ENDIF
    }//

     //***************************************************************************
     //SUBMODULE clone
     //IMPORT: none
     //EXPORT: cloneDinosaur(Dinosaur)
     //ASSERTION: creates clone of object
     //***************************************************************************
    public Plesiosaur clone()
    {
        return new Plesiosaur(this);
    }
  
    public String toString()
    {
        return (super.toString() + "hasTailFin: " + hasTailFin);
    }
 
    //PRIAVTE SUBMODULES
    //***************************************************************************
    //All private submodules validate the class fields and returns a boolean value
    //*************************************************************************** 
    private boolean validateHasTailFin(String inHasTailFin)
    {
        boolean valid;
        if ((inHasTailFin = true)||(inHasTailFin = false))
        { 
            valid = true;
        }
        else
        {
            valid = false;
        }//ENDIF
        return valid;
    }    
}//END CLASS





















