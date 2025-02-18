package FileSystem;

public class Client {
	public static void main(String args[])
	{
		Directory movieDirectory= new Directory("movie");
		
		File ddlj= new File("DDLJ");
		movieDirectory.add(ddlj);
		
		Directory comedyMovieDirectory= new Directory("ComedyMovie");
		File hulchul= new File("Hulchul");
		comedyMovieDirectory.add(hulchul);
		movieDirectory.add(comedyMovieDirectory);
		
		movieDirectory.ls();
	}
}
