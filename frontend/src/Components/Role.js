import React, { useState } from "react";
import { MultiSelect } from 'primereact/multiselect';

export default function Role() {
    const [selectedRoles, setSelectedRoles] = useState(null);
    const cities = [
        { name: 'Volunteer', code: 'V' },
        { name: 'Organization', code: 'O' },
    ];

    return (
        <div className="card flex justify-content-center" style={{ display: 'flex', alignItems: 'center' }}>
            <div style={{ marginRight: '10px' }}> {/* Added div for spacing */}
                <MultiSelect value={selectedRoles} onChange={(e) => setSelectedRoles(e.value)} options={cities} optionLabel="name"
                             placeholder="Select Role" maxSelectedLabels={1} className="w-full md:w-20rem"
                             showSelectAll={false}
                />
            </div>
            <style>
                {`
                .p-multiselect-panel .p-multiselect-items .p-multiselect-item {
                    background-color: white;
                }
                `}
            </style>
        </div>
    );
}




