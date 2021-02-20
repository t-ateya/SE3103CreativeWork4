package model.interfaces;
import model.util.Date;


public interface IGame  extends IProduct{
	public abstract Date getDate();
	public abstract String getTitle();

	public abstract void setDate(Date date);
	public abstract void setTitle(String title);
	
}
