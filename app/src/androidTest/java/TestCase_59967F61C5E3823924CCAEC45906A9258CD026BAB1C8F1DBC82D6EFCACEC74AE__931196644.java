import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE__931196644 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Builder.class);
      Object var1 = EasyMock.createMock(RemoteViews.class);
      ((Builder)var2).setContent((RemoteViews)var1);
   }
}
