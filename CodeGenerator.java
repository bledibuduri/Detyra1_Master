//Detyra 1
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Klasa CodeGenerator për gjenerimin e kodit të klasës
class CodeGenerator {

    // Metoda për gjenerimin e kodit të klasës
    public static String generateClass(String className, List<String[]> variables, List<String[]> methods) {
        StringBuilder code = new StringBuilder("class " + className + " {\n\n");

        // Gjenerojmë variablat private të instancës
        for (String[] variable : variables) {
            String type = variable[0]; // Lloji i të dhënave
            String name = variable[1]; // Emri i variablës
            code.append("    private " + type + " " + name + ";\n");
        }

        // Konstruktor pa parametra
        code.append("\n    public " + className + "() {\n        // Konstruktor pa parametra\n    }\n\n");

        // Konstruktor me parametra
        code.append("    public " + className + "(");
        for (int i = 0; i < variables.size(); i++) {
            String[] variable = variables.get(i);
            String type = variable[0];
            String name = variable[1];
            code.append(type + " " + name);
            if (i < variables.size() - 1) {
                code.append(", ");
            }
        }
        code.append(") {\n");
        for (String[] variable : variables) {
            String name = variable[1];
            code.append("        this." + name + " = " + name + ";\n");
        }
        code.append("    }\n\n");

        // Gjenerojmë metodat get dhe set për secilën variabël private
        for (String[] variable : variables) {
            String type = variable[0];
            String name = variable[1];
            String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);

            // Getter
            code.append("    public " + type + " get" + capitalized + "() {\n");
            code.append("        return this." + name + ";\n    }\n\n");

            // Setter
            code.append("    public void set" + capitalized + "(" + type + " " + name + ") {\n");
            code.append("        this." + name + " = " + name + ";\n    }\n\n");
        }

        // Gjenerojmë metodat publike të specifikuara
        for (String[] method : methods) {
            String returnType = method[0]; // Lloji i rezultatit kthyes
            String methodName = method[1]; // Emri i metodës
            code.append("    public " + returnType + " " + methodName + "() {\n");
            code.append("        // Implementimi i metodës\n    }\n\n");
        }

        // Mbyllim definicionin e klasës
        code.append("}");
        return code.toString();
    }

    // Klasa kryesore Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Krijojmë listat për variablat dhe metodat
        List<String[]> variables = new ArrayList<>();
        List<String[]> methods = new ArrayList<>();

        // Input për variablat private
        System.out.println("Jepni numrin e variablave private:");
        int numVariables = scanner.nextInt();
        scanner.nextLine(); // për të lexuar newline-in pas numrit
        for (int i = 0; i < numVariables; i++) {
            System.out.println("Jepni llojin e të dhënave dhe emrin e variablës (ndërmjet hapësirave):");
            String input = scanner.nextLine();
            String[] variable = input.split(" ");
            
            if (variable.length != 2) {
                System.out.println("Gabim në formatin e inputit. Duhet të jepni llojin dhe emrin e variablës.");
                i--; // Përsërit procesin për këtë variabël
                continue;
            }

            variables.add(variable);
        }

        // Input për metodat publike
        System.out.println("Jepni numrin e metodave publike:");
        int numMethods = scanner.nextInt();
        scanner.nextLine(); // për të lexuar newline-in pas numrit
        for (int i = 0; i < numMethods; i++) {
            System.out.println("Jepni llojin e rezultatit kthyes dhe emrin e metodës (ndërmjet hapësirave):");
            String input = scanner.nextLine();
            String[] method = input.split(" ");

            if (method.length != 2) {
                System.out.println("Gabim në formatin e inputit. Duhet të jepni llojin dhe emrin e metodës.");
                i--; // Përsërit procesin për këtë metodë
                continue;
            }

            methods.add(method);
        }

        // Kërkojmë emrin e klasës
        System.out.println("Jepni emrin e klasës:");
        String className = scanner.nextLine();

        // Gjenerojmë kodin për klasën
        String generatedCode = generateClass(className, variables, methods);
        System.out.println("\nKodi i gjeneruar për klasën:\n" + generatedCode);
    }
}
