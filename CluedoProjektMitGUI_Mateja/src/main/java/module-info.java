module ch.bbw.pr.cluedo {
	requires transitive javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.graphics;
	requires transitive javafx.fxml;

    opens ch.bbw.pr.cluedo to javafx.fxml;
    exports ch.bbw.pr.cluedo;
}