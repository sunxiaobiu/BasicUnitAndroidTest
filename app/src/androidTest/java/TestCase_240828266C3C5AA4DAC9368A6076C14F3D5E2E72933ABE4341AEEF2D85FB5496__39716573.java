import android.net.Network;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_240828266C3C5AA4DAC9368A6076C14F3D5E2E72933ABE4341AEEF2D85FB5496__39716573 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Network.class);
      String var1 = "android";
      ((Network)var2).getAllByName(var1);
   }
}
