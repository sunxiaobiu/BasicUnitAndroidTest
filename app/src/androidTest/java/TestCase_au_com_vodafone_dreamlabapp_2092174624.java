import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_2092174624 {
   @Test
   public void testCase() throws Exception {
      Time var1 = new Time();
      Time var2 = new Time(var1);
      Object var3 = EasyMock.createMock(Time.class);
      var2.set((Time)var3);
   }
}
