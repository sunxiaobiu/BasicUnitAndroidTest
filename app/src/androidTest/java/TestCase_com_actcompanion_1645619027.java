import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_actcompanion_1645619027 {
   @Test
   public void testCase() throws Exception {
      LevelListDrawable var2 = new LevelListDrawable();
      Object var1 = EasyMock.createMock(Drawable.class);
      var2.addLevel(0, 0, (Drawable)var1);
   }
}
