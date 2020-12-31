import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_net_abc_abcme_1566174083 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Drawable.class);
      AnimationDrawable var3 = (AnimationDrawable)var2;
      byte var1 = 1;
      var3.getFrame(var1);
   }
}
