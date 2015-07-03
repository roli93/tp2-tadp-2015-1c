package tadp_pokemon

import scala.util.{Try,Success,Failure}

class Rutina(val actividades: List[Actividad] = List(), val nombre: String) extends Actividad{
    
  def realizarActividad(pokemon: Try[Pokemon]): Try[Pokemon] =
    actividades.foldLeft[Try[Pokemon]](pokemon){
    (pokemon:Try[Pokemon], actividad: Actividad) =>
      actividad.realizarActividad(pokemon)    
    }
  
}