package be.stijn.gamescatalog.consoles.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import be.stijn.gamescatalog.consoles.model.Console;

@Path(value = "consoles")
public class Consoles {
	
	public static List<Console> consoles;
	
	static {
		Console ps1 = new Console.ConsoleBuilder().manufacturer("Sony").name("Playstation 1").year(1997).build();
		Console ps2 = new Console.ConsoleBuilder().manufacturer("Sony").name("Playstation 2").year(1997).build();
		Console nes = new Console.ConsoleBuilder().manufacturer("Nintendo").name("Nintendo Entertainment System").year(1987).build();
		consoles = Arrays.asList(ps1, ps2, nes);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Console> getConsoles() {
		return consoles;
	}
}
