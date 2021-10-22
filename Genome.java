//****************************************************************
//Author: Prassana Kamalakannan
//Filename: JurassicPark.java
//DateModified: 29/10/2017
//****************************************************************

public final class Genome
{  
    //CLASS FIELDS
    private String genome;   
    

    public Genome()
    {
        genome = "AGTC";
    }//END Default

    public Genome(String inGenome)
    {
        if (validateGenome(genome))
        {
            genome = inGenome;
        }
        else
        {
            throw IllegalArgumentException("Invalid import values");
        }//ENDIF
    }//END Alternate

    public Genome(Genome inGenome)
    {
        genome = inGenome.getGenome();
    }//END Copy

    //MUTATORS
    public void setGenome(String inGenome)
    {
        if (validateGenome(inGenome)
        {
            genome = inGenome;
        }
        else
        {
            throw IllegalArgumentExcpetion("Invalid genome");
        }//ENDIF 
    }//END setGenome

    public String getGenome
    {
        return genome;
    }//END getGenome

    public boolean equals(Object inObj)
    {
        boolean isEqual = false;
        if (inObj instanceof Genome)
        { 
            Dinosaur inDinosaur = (Dinosaur)inObj;
            isEqual = genome.equals(inDinosaur.getGenome);
        }//ENDIF
    }//END equals

    public Genome clone() 
    {
        Dinosaur cloneDinosaur = new Dinosaur(this.genome);
        return cloneDinosaur;
    }//END clone

    public String toString(String str)
    {
        return ("Genome sequence: " + genome);
    }//END toString

    //PRIVATE SUBMODULES
    private boolean validateGenome(String inGenome)
    {
        boolean valid;
        for (int i = 0; i < inGenome.length(); i++)
        {
            char letter = inGenome.charAt(i);
            if ((char letter == 'A')||(char letter == 'G')||(char letter == 'C')||(char letter == 'T'))
            {
                valid = true;
            }
            else
            {
                valid = false;
            }//ENDIF
        }//ENDFOR
    }//END validateGenome

    
