import java.util.HashMap;

public abstract class articles {

  HashMap < String,
  Integer > colors = new HashMap < String,
  Integer > ();
  String speak(String color) {
    return "I'm " + getName() + "! I'm sometimes " + color;
  }

  abstract String getName();

}

class apple extends articles {

  apple() {
    colors.put("red", 1);
    colors.put("green", 1);
  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "Apple";
  }

}

class banana extends articles {

  banana() {
    colors.put("yellow", 1);
    colors.put("green", 1);
  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "Banana";
  }

}

class salt extends articles {

  salt() {
    colors.put("white", 1);

  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "Salt";
  }

}

class ink extends articles {

  ink() {
    colors.put("red", 1);
    colors.put("black", 1);
  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "Ink";
  }

}

class blood extends articles {

  blood() {
    colors.put("red", 1);

  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "blood";
  }

}

class sky extends articles {

  sky() {
    colors.put("blue", 1);
    colors.put("black", 1);
  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "Sky";
  }

}

class frog extends articles {

  frog() {
    colors.put("blue", 1);
    colors.put("yellow", 1);
  }

  @Override
  String getName() {
    // TODO Auto-generated method stub
    return "Frog";
  }

  String speak(String color) {
    return "I'm " + getName() + "! I am " + color + " today";
  }

}