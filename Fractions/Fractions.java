//Savan Malhotra 
//September 19th 2019
//ICS 4U1
//Mrs. Baf
public class Fractions {
	
	public double numerator;
	public double denominator;

	//Constructor for the class  - initializes the values of the numerator and the denominator
	public Fractions(double n, double d) {
		this.numerator = n;
		this.denominator = d;
	}
	
	//will reduce the fraction to its lowest common denominator by finding the greatest common factor
	public void reduce() {
		for(double i = Math.max(this.numerator, this.denominator);i > 0;i-- ) {
			//checks to see if the i value can be divided equally into the numerator and the denominator without any remainders or decimals - whole numbers only
			if(this.numerator%i == 0 && this.denominator%i==0) {
				this.numerator = this.numerator/i;//sets reduced version of the numerator
				this.denominator = this.denominator/i;//sets the reduced version of the denominator
			}
		}
	}
	
	//will add another fraction to this one
	public void add(Fractions other) {
		if(this.denominator == other.denominator) {
			//adds the numerators together if the denominators are the same
			this.numerator = this.numerator + other.numerator;
		}
		else {
			//logic to find the lowest common denominator to be able to add the fractions
			double oldDenominator = this.denominator;
			
			//this multiples the current fraction by the other denominator
			this.denominator = this.denominator * other.denominator;
			this.numerator = this.numerator * other.denominator;
			
			//this multiplies the other fraction by the old denominator of this fraction
			other.denominator = other.denominator * oldDenominator;
			other.numerator = other.numerator * oldDenominator;
			
			//now we add the values together
			this.numerator = this.numerator + other.numerator;
			
			//calling the reduce method to reduce the fraction to its lowest terms
			reduce();
		}
	}
	
	//will subtract another fraction from this one
	public void subtract(Fractions other) {
		if(this.denominator == other.denominator) {
			//subtracts the numerators together if the denominators are the same
			this.numerator = this.numerator - other.numerator;
		}
		else {
			//logic to find the lowest common denominator to be able to subtract the fractions
			double oldDenominator = this.denominator;
			
			//this multiples the current fraction by the other denominator
			this.denominator = this.denominator * other.denominator;
			this.numerator = this.numerator * other.denominator;
			
			//this multiplies the other fraction by the old denominator of this fraction
			other.denominator = other.denominator * oldDenominator;
			other.numerator = other.numerator * oldDenominator;
			
			//now we subtract the values together
			this.numerator = this.numerator - other.numerator;
			
			//calling the reduce method to reduce the fraction to its lowest terms
			reduce();
		}
	}
	
	//multiplies the fraction by another
	public void multiply(Fractions other) {
		this.numerator = this.numerator * other.numerator;
		this.denominator = this.denominator * other.denominator;
	}
	
	//divides the fraction by another  
	public void divide(Fractions other) {
		reciprocal();//flips the current fraction
		multiply(other);//since the current fraction is flipped, you can just multiply
		reduce();
	}
	
	//checks if the current fraction is equal to the parameter fraction
	public boolean equals(Fractions other) {
		if((this.numerator/this.denominator) == (other.numerator/other.denominator)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//checks if the current fraction is greater than the parameter fraction 
	public boolean greaterThan(Fractions other) {
		if((this.numerator/this.denominator) > (other.numerator /other.denominator)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//checks id the current fraction is less than the parameter function
	public boolean lessThan(Fractions other) {
		if((this.numerator/this.denominator) < (other.numerator /other.denominator)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//changes the fraction to its reciprocal
	public void reciprocal() {
		//needs to hold the denominator as we change it later on.
		double holdingOldDenominator = this.denominator;
		this.denominator = this.numerator;//sets the denominator to the numerator
		this.numerator = holdingOldDenominator;//sets the numerator to the denominator value prior to the call of this method
	}
	
	//returns the value of the fraction as a double
	public double value() {
		return (double) (this.numerator/this.denominator);//returns the double value of the fractions by dividing the numerator by the denominator
	}
	
	//returns the string value of the fraction
	public String toString() {
		return (this.numerator + " / " + this.denominator);//prints the fraction as a string
	}
	
	//returns fraction as a mixed number
	public String toMixed() {
		//checks if the numerator is greater than the denominator
		if(this.numerator > this.denominator) {
			return (String) ((int)(this.numerator/this.denominator) + " " + (this.numerator%this.denominator) + "/" + this.denominator);
		}
		//checks if the numerator is equal to the denominator
		else if(this.numerator%this.denominator == 0) {
			return (String) ((int)(this.numerator/this.denominator) + "");
		}
		//returns the fraction as is since the numerator is less than the denominator
		else {
			return (String) (this.numerator + "/" + this.denominator);
		}
	}
}
