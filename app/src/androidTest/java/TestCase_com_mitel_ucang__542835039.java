import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_mitel_ucang__542835039 {
   @Test
   public void testCase() throws Exception {
      RectShape var2 = new RectShape();
      ShapeDrawable var3 = new ShapeDrawable();
      Object var1 = EasyMock.createMock(Rect.class);
      var3.setPadding((Rect)var1);
   }
}
