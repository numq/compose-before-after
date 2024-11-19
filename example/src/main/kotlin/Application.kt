import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.singleWindowApplication
import com.numq.composebeforeafter.BeforeAfter

fun main() = singleWindowApplication(title = "Before After") {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BeforeAfter(modifier = Modifier.weight(1f), before = {
            Box(
                modifier = Modifier.fillMaxSize().background(color = Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text("BEFORE", fontSize = 128.sp)
            }
        }, after = {
            Box(
                modifier = Modifier.fillMaxSize().background(color = Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Text("AFTER", fontSize = 128.sp)
            }
        })
    }
}