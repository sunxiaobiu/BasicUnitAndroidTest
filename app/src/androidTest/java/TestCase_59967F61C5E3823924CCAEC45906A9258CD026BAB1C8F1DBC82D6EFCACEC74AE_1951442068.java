import android.app.Application;
import android.content.ComponentCallbacks;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59967F61C5E3823924CCAEC45906A9258CD026BAB1C8F1DBC82D6EFCACEC74AE_1951442068 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Application.class);
      Object var1 = EasyMock.createMock(ComponentCallbacks.class);
      ((Application)var2).registerComponentCallbacks((ComponentCallbacks)var1);
   }
}
