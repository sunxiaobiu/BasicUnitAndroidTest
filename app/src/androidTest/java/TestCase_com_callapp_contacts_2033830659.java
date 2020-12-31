import android.graphics.drawable.Drawable;
import android.preference.PreferenceScreen;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts_2033830659 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PreferenceScreen.class);
      Object var1 = EasyMock.createMock(Drawable.class);
      ((PreferenceScreen)var2).setIcon((Drawable)var1);
   }
}
