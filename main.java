public Main(String[] arguments){
    Args args = parseArguments(arguments);
    
    Finder finder = new Finder(args);
    for(String base: args){
        String[] items = finder.find(base);
        for(String item: items){
            System.out.println(item);
        }
    }
}
