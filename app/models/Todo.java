package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Todo extends Model {

	public String tarea;
	public Boolean lista = false;

}
