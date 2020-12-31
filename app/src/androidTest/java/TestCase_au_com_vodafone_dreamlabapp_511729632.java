import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_511729632 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Time.class);
      Object var1 = EasyMock.createMock(Time.class);
      Time.compare((Time)var0, (Time)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
