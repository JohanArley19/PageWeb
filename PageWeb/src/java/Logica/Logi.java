package Logica;


public class Logi 
{
    public String chat (String texto)
{
    String ret="";
    if (texto.equals("Ole") || texto.equals("Como estas") || texto.equals("Holaaa") || texto.equals("Holi") || texto.equals("Oye")) 
    {
        ret= "Holaaa :D";
    
        if (texto.equals("¿Salimos a caminar?") || texto.equals("¿Que haras hoy?") || texto.equals("¿Vamos por un cafe?") || texto.equals("¿Quieres ir por un helado?") || texto.equals("¿Te gustaria ir a cine?")) 
        {
            ret= "Claro que si, me encantaria";
    
            if (texto.equals("¿Te gusta ver futbol?") || texto.equals("¿Te gustan los videojuegos?") || texto.equals("¿Te gusta el anime?") || texto.equals("¿Te gusta el voleibol?") || texto.equals("¿Te gusta ver peliculas de terror?"))
            {
                ret= "En algunas ocasiones si, pero casi no la verdad.";
    
                if (texto.equals("¿Te gusta escuchar salsa?") || texto.equals("¿Te gusta escuchar vallenato?") || texto.equals("¿Te gusta escuchar rancheras?") || texto.equals("¿Te gusta escuchar trap?") || texto.equals("¿Te gusta escuchar electronica ")) 
                {
                    ret= "¡Si! De hecho es mi genero favorito.";
                    
                    if (texto.equals("¿Conoces mundo aventura?") || texto.equals("¿Conoces piscilago?") || texto.equals("¿Conoces la hacienda Napoles?") || texto.equals("¿Conoces Monserrate?") || texto.equals("¿Conoces el caño cristales")) 
                    {
                        ret= "No, pero me encataría ir allí.";
                    }
                }
            } 
        }
    }
    return ret;
} 
    
}

