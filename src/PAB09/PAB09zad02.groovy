package PAB09

import groovy.swing.SwingBuilder
import java.awt.*
import static javax.swing.WindowConstants.*

//defaultCloseOperation

//text preferences
foregroundColor = Color.DARK_GRAY

int i = 0
backgroundColor = []
Random rnd = new Random()
1.upto(5) {
    backgroundColor.add(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255))
    )
}

fontType = new Font('Dialog', Font.BOLD, 24)
//

swing = new SwingBuilder()

swing.edt {
    lookAndFeel('nimbus')
    frame = frame(title: 'Groovy Swing', pack: true,
            visible: true,
            defaultCloseOperation: EXIT_ON_CLOSE) {
        button(text: "Color changer", preferredSize: new Dimension(300, 300),
                foreground: foregroundColor, font: fontType,
                actionPerformed: { e ->
                    frame.title = "Color changer"
                    i == backgroundColor.size()-1 ? (i = 1) : (i += 1)
                    e.source.background = backgroundColor.get(i)
                    e.source.text = 'Color nr ' + i
                }
        )
    }
}