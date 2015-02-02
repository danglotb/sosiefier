package fr.inria.diversify.ut.json.output;

import fr.inria.diversify.persistence.json.output.JsonSosiesOutput;
import fr.inria.diversify.transformation.Transformation;
import org.json.JSONObject;

import java.util.Collection;

/**
 * Created by marodrig on 14/01/2015.
 */
public class JsonSosieOutputForUT extends JsonSosiesOutput {

    public JsonSosieOutputForUT(Collection<Transformation> transformations, String uri) {
        super(transformations, uri);
    }

    public JSONObject getJSONObject() {
        return outputObject;
    }
}