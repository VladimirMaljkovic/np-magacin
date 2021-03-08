package magacin;

public class KancelarijskiMaterijal extends Artikal {

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KancelarijskiMaterijal: " + super.toString();
	}

	
	
}
