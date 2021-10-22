//****************************************************************
//Author: Prassana Kamalakannan
//Filename: Triceratops.txt
//DateModified: 29/10/2017
//****************************************************************

public class Triceratops extends Dinosaur
{
    //PRIVATE CLASSFIELDS

    private int numHorns;

     //CONSTRUCTORS
     //***************************************************************
     // Default constructor:
     // IMPORT: none
     // EXPORT: none
     // ASSERTION: Constructs object with default state
     //****************************************************************
    public Triceratops()
    {
        super();
        numHorns = 3;
    }
 
     //*************************************************************************
     //Alternate Constructor:
     //IMPORT: inName(String), inMass(real), inGenome(String)
     //EXPORT: none
     //ASSERTION: Constructs object with imported values provided they are valid
     //*************************************************************************
    public Triceratops(String inName, double inMass, String inGenome, int inNumHorns)
    {
        super(inName, inMass);
        if (validateNumHorns(numHorns))
        {
            numhorns = inNumhorns;
        }
        else
        {
            throw IllegalArgumentException("Invalid import agruements");
        }
    }

    //**************************************************************************
    //Copy Constructor:
    //IMPORT: inDinosaur(Dinosaur)
    //EXPORT: none
    //ASSERTION: Creates object with identical state as the import
    //**************************************************************************
    public Triceratops(Triceratops inTriceratops)
    {
        super(inTriceratops);
        numHorns = inTriceratops.getNumHorns();
    }
  
    //MUTATORS
    //***************************************************************************
    //SUBMODULE setHasTailFin
    //IMPORT: inHasTailFin
    //EXPORT: none
    //ASSERSTION: sets hasTailFin to inHasTailFin if import is valid
    //***************************************************************************
    public void setNumHorns(int inNumHorns)
    {
        if (validateNumHorns(inNumHorns))
        {
            numHorns = inNumHorns;
        }
        else
        {
            throw IllegalArgumentException("invalid number of horns");
        }
    }
    
    //ACCESSORS
    //**************************************************************************
    //SUBMODULE calcEnclosureSize
    //calculates enclosure size and returns value to abstract method in Dinosaur
    //***************************************************************************
    @Override
    public double calcEnclosureSize()
    {
        return (mass*Math.PI*(Math.pow(4, (double)numHorns)));
    } 

     //***************************************************************************
     //SUBMODULE getNumHorns
     //IMPORT: none
     //EXPORT: numHorns
     //***************************************************************************
    public int getNumHorns()
    {
        return numHorns;
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
        if (inObj instanceof Triceratops)
        { 
            Triceratops inTriceratops = (Triceratops)inObj;
            if (super.equals(inTriceratops))
            {
                if (numHorns == inTriceratops.getNumHorns())
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
    public Triceratops clone()
    {
        return new Triceratops(this);
    }

    public String toString()
    {
        return (super.toStirng + "Number of horns: " + numHorns
    }

    //PRIAVTE SUBMODULES
    //***************************************************************************
    //All private submodules validate the class fields and returns a boolean value
    //***************************************************************************
    private boolean validateNumHorns(int inNumHorns)
    {
        return (inNumHorns >= 3) && (inNumHorns%3==0)
    }
}   























