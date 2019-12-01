package PAB07

def resourcesDir = new File('E:\\Pliki\\GitHub\\PAB_Groovy\\src\\PAB07')
resourcesDir.eachDirRecurse {
    it.eachFileMatch( ~/\w+\.html/) { println "$it" }
}