import android.appwidget.AppWidgetProvider;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_worklog_532302571 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Intent var2 = new Intent(var1, AppWidgetProvider.class);
      int[] var3 = new int[1];
      var2.putExtra("appWidgetIds", var3);
   }
}
