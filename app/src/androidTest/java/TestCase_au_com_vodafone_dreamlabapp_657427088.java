import android.text.format.Time;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_657427088 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Time.class);
      int var2 = ((Time)var1).getActualMaximum(4);
   }
}
