import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme_1550492720 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Drawable.class);
      AnimationDrawable var2 = (AnimationDrawable)var1;
      boolean var3 = var2.isOneShot();
   }
}
