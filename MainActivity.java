onEvent("age_dropdown", "change", function(event) {
  console.log("Selected option: " + getText("age_dropdown"));
  getNumber("age_dropdown");
  if (("age_dropdown") >= 13) {
    write("you're okay");
  } else {
    write("unable to watch");
  }
  
});
