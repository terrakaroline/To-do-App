package todoApp;

import java.util.Date;
import java.util.List;

import controller.ProjectController;
import controller.TaskController;
import model.Project;
import model.Task;

public class App {
    public static void main(String[] args) {
        
        // ProjectController projectController = new ProjectController();
        
        // Project project = new Project();
        // project.setName("projeto teste");
        // project.setDescription("Descricao");
        // projectController.save(project);
        
        // //TESTANDO O PROJECT CONTROLLER

        
        // project.setId(4);
        // project.setName("Novo nome do projeto");
        // project.setDescription("description");
        
        // projectController.update(project);
        
        // List<Project> projects = projectController.getAll();
        // System.out.println("Total de projetos = " + projects.size());

        // projectController.removeByID(3);

        //TESTANDO O TASK CONTROLLER

        TaskController taskController = new TaskController();

        Task task = new Task();

        task.setIdProject(4);
        // task.setName("Criar as telas da aplicação");
        // task.setDescription("Devem ser criadas telas para os cadastros");
        // task.setNotes("sem notas");
        // task.setIsCompleted(false);
        // task.setDeadline(new Date());

        // taskController.save(task);

        task.setName("Alterar telas de aplicação");
        taskController.update(task);
        // List<Task> tasks = taskController.getAll(4);
        // System.out.println("Total de tarefas = " + tasks.size());

        
    }
}
