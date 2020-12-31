import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59B91DC5A95B898EAE79F47691F2D34CE2478D0A3697A8E3BA8E4CD6D1ECBD4D_1773756046 {
   @Test
   public void testCase() throws Exception {
      AnimationDrawable var2 = new AnimationDrawable();
      Object var1 = EasyMock.createMock(Drawable.class);
      var2.addFrame((Drawable)var1, 2500);
   }
}
