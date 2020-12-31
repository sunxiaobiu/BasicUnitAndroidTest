import android.content.res.Resources;
import android.provider.ContactsContract.CommonDataKinds.Event;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_598173D17F9AB4896DF67F5F3EEE2610CB7859357E7BF654F6DA30843011D3F3_770961690 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      byte var1 = 1;
      Event.getTypeLabel((Resources)var0, var1, "");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
