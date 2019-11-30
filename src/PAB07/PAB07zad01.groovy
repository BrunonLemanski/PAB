package PAB07

def empsMap = [:]
def projektyDuzeFile = new File('projekyDuze')
def projektyFile = new File('E:\\Pliki\\IJ Workspace\\PAB01\\src\\PAB07\\Projekty').eachLine { line ->
    def tokens = line.tokenize('\t')
    def project = tokens[0]
    def emps = tokens[1..tokens.size() - 1]
    emps.each { emp ->
        if (empsMap.containsKey(emp))
            empsMap.get(emp).add(project)
        else {
            def nList = [project]
            empsMap.put(emp, nList)
        }
    }
    if (emps.size() > 3) projektyDuzeFile << "$project: $emps \n"
}

def programisciFile = new File('programisci')
empsMap.each { key, value -> programisciFile << "Dev: $key \nProjekty: $value \n\n" }