package PAB07

def projektyFile = new File('E:\\Pliki\\IJ Workspace\\PAB01\\src\\PAB07\\Projekty')

def projektyContent = projektyFile.text

new File('projekyDuze') << projektyContent.findAll('(/d+)\t(((/d+)\t)+)', { all, project, persons ->
    persons.size > 3
})